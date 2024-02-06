####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Fence.py
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

newModel=X3D(profile='Interchange',version='3.3',
  head=head(
    children=[
    meta(content='Fence.x3d',name='title'),
    meta(content='Chain-link fence illustrates the use of rotation and scaling within texture transforms.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/fence.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0297.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Fence.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Fence.x3d'),
    Viewpoint(description='Entry view',position=(0.0,0.0,5.0)),
    NavigationInfo(),
    Shape(
      appearance=Appearance(
        textureTransform=TextureTransform(center=(0.5,0.5),rotation=0.7853982,scale=(8.5,8.5)),
        material=Material(),
        texture=ImageTexture(url=["grill.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/grill.png"])),
      geometry=IndexedFaceSet(coordIndex=[0,1,2,3,-1,4,5,6,7,-1,8,9,10,11,-1,12,13,14,15],solid=False,texCoordIndex=[0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3],
        texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(1.0,1.0),(0.0,1.0)]),
        coord=Coordinate(point=[(-4.0,-1.0,0.1),(-2.0,-1.0,0.1),(-2.0,1.0,0.1),(-4.0,1.0,0.1),(-2.0,-1.0,0.1),(0.0,-1.0,0.1),(0.0,1.0,0.1),(-2.0,1.0,0.1),(0.0,-1.0,0.1),(2.0,-1.0,0.1),(2.0,1.0,0.1),(0.0,1.0,0.1),(2.0,-1.0,0.1),(4.0,-1.0,0.1),(4.0,1.0,0.1),(2.0,1.0,0.1)]))),
    Shape(DEF='Post',
      appearance=Appearance(
        material=Material(),),
      geometry=Cylinder(radius=0.1)),
    Transform(translation=(-4.0,0.0,0.0),
      children=[
      Shape(USE='Post')]),
    Transform(translation=(4.0,0.0,0.0),
      children=[
      Shape(USE='Post')])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Fence.py:')
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

print("python Fence.py load and self-test diagnostics complete.")
