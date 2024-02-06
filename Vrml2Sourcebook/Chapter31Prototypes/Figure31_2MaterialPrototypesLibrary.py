####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure31_2MaterialPrototypesLibrary.py
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

newModel=X3D(profile='Immersive',version='3.0',
  head=head(
    children=[
    meta(content='Figure31_2MaterialPrototypesLibrary.x3d',name='title'),
    meta(content='Figure 31.2, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch31/31fig02.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='27 September 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='An external file containing a material library with the WallColor-node-type definition.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_2MaterialPrototypesLibrary.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure31_2MaterialPrototypesLibrary.x3d'),
    ProtoDeclare(name='Aqua',
      ProtoBody=ProtoBody(
        children=[
        Material(diffuseColor=(0,0.6,1))])),
    ProtoDeclare(name='Gold',
      ProtoBody=ProtoBody(
        children=[
        Material(ambientIntensity=0.4,diffuseColor=(0.22,0.15,0),shininess=0.16,specularColor=(0.71,0.70,0.56))])),
    ProtoDeclare(name='Aluminum',
      ProtoBody=ProtoBody(
        children=[
        Material(ambientIntensity=0.3,diffuseColor=(0.3,0.3,0.5),shininess=0.1,specularColor=(0.7,0.7,0.8))])),
    ProtoDeclare(name='Copper',
      ProtoBody=ProtoBody(
        children=[
        Material(ambientIntensity=0.26,diffuseColor=(0.30,0.11,0),shininess=0.08,specularColor=(0.75,0.33,0))])),
    #  It is a good practice to include default message linking to an example scene, in case a user tries to view this Prototype library directly. 
    Anchor(description='Figure31_3MaterialExternalPrototypes',url=["Figure31_3MaterialExternalPrototypes.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_3MaterialExternalPrototypes.x3d","Figure31_3MaterialExternalPrototypes.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_3MaterialExternalPrototypes.wrl"],
      children=[
      Shape(
        geometry=Text(string=["Figure31_2MaterialPrototypesLibrary","contains prototype definitions","","Click on text to see these Materials in","Figure31_3MaterialExternalPrototypes"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.5)),
        appearance=Appearance(
          material=Material(diffuseColor=(0,0.6,0.6))))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure31_2MaterialPrototypesLibrary.py:')
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

print("python Figure31_2MaterialPrototypesLibrary.py load and self-test diagnostics complete.")
