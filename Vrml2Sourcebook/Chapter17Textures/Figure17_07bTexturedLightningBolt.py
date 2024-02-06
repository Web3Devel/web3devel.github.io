####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure17_07bTexturedLightningBolt.py
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

newModel=X3D(profile='Interchange',version='3.0',
  head=head(
    children=[
    meta(content='Figure17_07bTexturedLightningBolt.x3d',name='title'),
    meta(content='Figure 17.07b, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch17/17fig07b.htm',name='reference'),
    meta(content='Don Brutzman',name='transcriber'),
    meta(content='August 28, 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A flame image textured onto a 3D lightning bolt using concave faces. Compare Figures 13.13 and 17.7b.',name='description'),
    meta(content='../Chapter13PointsLinesFaces/Figure13_13IndexedFaceSetLightningBolt.x3d',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter17Textures/Figure17_07bTexturedLightningBolt.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure17_07bTexturedLightningBolt.x3d'),
    Viewpoint(description='Textured lightning bolt',position=(4,5,15)),
    Group(
      children=[
      Shape(
        appearance=Appearance(
          texture=ImageTexture(url=["bolt2.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter17Textures/bolt2.jpg"])),
        geometry=IndexedFaceSet(convex=False,coordIndex=[0,1,2,3,4,5,6,-1,0,12,11,10,9,8,7,-1,0,7,1,-1,1,7,8,2,-1,2,8,9,3,-1,3,9,10,4,-1,4,10,11,5,-1,5,11,12,6,-1,6,12,0],
          coord=Coordinate(point=[(0.0,0.0,0.0),(5.5,5.0,0.88),(4.0,5.5,0.968),(7.0,8.0,1.408),(4.0,9.0,1.584),(1.0,5.0,0.88),(2.5,4.5,0.792),(5.5,5.0,-0.88),(4.0,5.5,-0.968),(7.0,8.0,-1.408),(4.0,9.0,-1.584),(1.0,5.0,-0.88),(2.5,4.5,-0.792)])))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure17_07bTexturedLightningBolt.py:')
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

print("python Figure17_07bTexturedLightningBolt.py load and self-test diagnostics complete.")
