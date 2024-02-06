####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python *enter FileNameWithNoAbbreviations.py
#
# Python package x3d.py package is available on PyPI for import.
#   This approach simplifies Python X3D deployment and use.
#   https://pypi.org/project/x3d
#
# Installation:
#       pip install x3d
# or
#       python -m pip install x3d
#
# Developer options for loading x3d package in other Python programs:
#
#    from x3d import *  # preferred approach, terser source that avoids x3d.* class prefixes
#
# or
#    import x3d         # traditional way to subclass x3d package, all classes require x3d.* prefix,
#                       # but python source is very verbose, for example x3d.Material x3d.Shape etc.
#                       # X3dToPython.xslt stylesheet insertPackagePrefix=true supports this option.
#
####################################################################################################

from x3d import *

newModel=X3D(profile='Immersive',version='4.0',
  head=head(
    children=[
    #  Authors need to replace asterisked values or delete unneeded meta tags as appropriate 
    meta(content='*enter FileNameWithNoAbbreviations.x3d here*',name='title'),
    meta(content='*enter description here, short-sentence summaries preferred*',name='description'),
    meta(content='*enter name of original author here*',name='creator'),
    meta(content='*if manually translating VRML-to-X3D, enter name of person translating here*',name='translator'),
    meta(content='*enter date of initial version here*',name='created'),
    meta(content='*enter date of translation here*',name='translated'),
    meta(content='9 July 2023',name='modified'),
    meta(content='*enter version here, if any*',name='version'),
    meta(content='*enter reference citation or relative/online url here*',name='reference'),
    meta(content='*enter additional url/bibliographic reference information here*',name='reference'),
    meta(content='*enter reference resource here if required to support function, delivery, or coherence of content*',name='requires'),
    meta(content='*enter copyright information here* Example: Copyright (c) Web3D Consortium Inc. 2006 to present',name='rights'),
    meta(content='*enter drawing filename/url here*',name='drawing'),
    meta(content='*enter image filename/url here*',name='Image'),
    meta(content='*enter movie filename/url here*',name='MovingImage'),
    meta(content='*enter photo filename/url here*',name='photo'),
    meta(content='*enter subject keywords here*',name='subject'),
    meta(content='*enter permission statements or url here*',name='accessRights'),
    meta(content='*insert any known warnings, bugs or errors here*',name='warning'),
    meta(content='*enter online Uniform Resource Identifier (URI) or Uniform Resource Locator (URL) address for this file here*',name='identifier'),
    meta(content='X3D-Edit 4.0, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license'),
    #  Additional authoring resources for meta tags: http://www.dublincore.org/documents/dcmi-terms http://www.dublincore.org/documents/dces https://www.w3.org/TR/html5/document-metadata.html#the-meta-element http://www.w3.org/TR/html4/struct/global.html#h-7.4.4 http://vancouver-webpages.com/META http://vancouver-webpages.com/META/about-mk-metas2.html 
    #  Additional authoring resources for language codes: https://tools.ietf.org/html/bcp47 http://www.loc.gov/standards/iso639-2/langhome.html http://www.iana.org/numbers.html#index_L 
    ]),
  Scene=Scene(
    #  Scene graph nodes are added here 
    )
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for *enter FileNameWithNoAbbreviations.py:')
if        metaDiagnostics(newModel): # built-in utility method in X3D class
    print(metaDiagnostics(newModel)) # display meta info, hint, warning, error, TODO values in this model
# print('check newModel.XML() serialization...')
newModelXML= newModel.XML() # test export method XML() for exceptions during export
newModel.XMLvalidate()
# print(newModelXML) # diagnostic

try:
#   print('check newModel.VRML() serialization...')
    newModelVRML=newModel.VRML() # test export method VRML() for exceptions during export
    # print(prependLineNumbers(newModelVRML)) # debug
    print("Python-to-VRML export of VRML output successful", flush=True)
except Exception as err: # usually BaseException
    # https://stackoverflow.com/questions/18176602/how-to-get-the-name-of-an-exception-that-was-caught-in-python
    print("*** Python-to-VRML export of VRML output failed:", type(err).__name__, err)
    if newModelVRML: # may have failed to generate
        print(prependLineNumbers(newModelVRML, err.lineno))

try:
#   print('check newModel.JSON() serialization...')
    newModelJSON=newModel.JSON() # test export method JSON() for exceptions during export
#   print(prependLineNumbers(newModelJSON)) # debug
    print("Python-to-JSON export of JSON output successful (under development)")
except Exception as err: # usually SyntaxError
    print("*** Python-to-JSON export of JSON output failed:", type(err).__name__, err)
    if newModelJSON: # may have failed to generate
        print(prependLineNumbers(newModelJSON,err.lineno))

print("python *enter FileNameWithNoAbbreviations.py load and self-test diagnostics complete.")
