####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure18_26cCorrectedTextureSanDiegoBay.py
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

newModel=X3D(profile='Interactive',version='3.0',
  head=head(
    children=[
    meta(content='Figure18_26cCorrectedTextureSanDiegoBay.x3d',name='title'),
    meta(content='Figure 18.26c, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch18/18fig26c.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='4 September 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A flat elevation grid using custom texture coordinates to reverse warping and invert the San Diego Bay image as it is applied. Compare Figures 18.26b and 18.26c.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter18TextureMapping/Figure18_26cCorrectedTextureSanDiegoBay.x3d',name='identifier'),
    meta(content='Figure18_26bUncorrectedTextureSanDiegoBay.x3d',name='reference'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure18_26cCorrectedTextureSanDiegoBay.x3d'),
    Viewpoint(description='Uncorrected texture, San Diego Bay',orientation=(1,0,0,-1.1),position=(0.4,1,1)),
    Shape(
      appearance=Appearance(
        texture=ImageTexture(url=["sdbaywlr.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter18TextureMapping/sdbaywlr.jpg"])),
      geometry=ElevationGrid(height=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],solid=False,xDimension=5,xSpacing=0.2,zDimension=5,zSpacing=0.2,
        texCoord=TextureCoordinate(point=[(0.250,1.000),(0.375,1.000),(0.500,1.000),(0.625,1.000),(0.750,1.000),(0.188,0.750),(0.344,0.750),(0.500,0.750),(0.656,0.750),(0.812,0.750),(0.125,0.500),(0.312,0.500),(0.500,0.500),(0.688,0.500),(0.875,0.500),(0.062,0.250),(0.281,0.250),(0.500,0.250),(0.719,0.250),(0.938,0.250),(0.0,0.000),(0.250,0.000),(0.500,0.000),(0.750,0.000),(1.0,0.0)])))])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure18_26cCorrectedTextureSanDiegoBay.py:')
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

print("python Figure18_26cCorrectedTextureSanDiegoBay.py load and self-test diagnostics complete.")