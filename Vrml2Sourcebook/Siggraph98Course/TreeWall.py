####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python TreeWall.py
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

newModel=X3D(profile='Immersive',version='3.3',
  head=head(
    children=[
    meta(content='TreeWall.x3d',name='title'),
    meta(content='A set of trees in front of a wall. This world illustrates the use of textures with a transparency channel (alpha channel). Such textures include pixel-by-pixel info about what parts of the image are transparent. A tree texture, for instance, should be opaque where there are leaves, branches, or the trun, and transparent everywhere else. To illustrate this use of transparency channel textures, this world places three trees side-by-side in front of a wall. The left tree polygon has no texture on it. The middle polygon has a tree texture without the transparency channel. The right polygon has a tree texture with a transparency texture. All three trees are in Billboard nodes so that they always turn to face the viewer.',name='description'),
    meta(content='David R. Nadeau, John L. Moreland, Michael M. Heck',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/treewall.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0273.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0274.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/TreeWall.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Trees in front of a wall'),
    Viewpoint(description='Entry view',position=(0.0,1.5,10.0)),
    NavigationInfo(speed=2.0),
    Shape(
      appearance=Appearance(DEF='Concrete',
        material=Material(),),
      geometry=IndexedFaceSet(coordIndex=[0,1,2,3,-1,3,2,4,5,-1,5,4,6,7,-1,7,6,8,9,-1,9,8,10,11,-1],solid=False,
        coord=Coordinate(point=[(-5.0,0.0,5.0),(5.0,0.0,5.0),(5.0,0.0,1.0),(-5.0,0.0,1.0),(5.0,0.05,1.0),(-5.0,0.05,1.0),(5.0,0.05,-2.0),(-5.0,0.05,-2.0),(5.0,0.25,-2.0),(-5.0,0.25,-2.0),(5.0,0.25,-2.05),(-5.0,0.25,-2.05)]))),
    Shape(
      appearance=Appearance(DEF='Brick',
        textureTransform=TextureTransform(scale=(15.0,15.0)),
        material=Material(),
        texture=ImageTexture(url=["brick.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/brick.jpg"])),
      geometry=IndexedFaceSet(coordIndex=[0,1,2,3],solid=False,texCoordIndex=[0,1,2,3],
        texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(1.0,1.0),(0.0,1.0)]),
        coord=Coordinate(point=[(-5.0,0.25,-2.05),(5.0,0.25,-2.05),(5.0,5.0,-2.05),(-5.0,5.0,-2.05)]))),
    Transform(DEF='Planter',scale=(0.5,0.5,0.5),
      children=[
      Shape(
        appearance=Appearance(USE='Concrete'),
        geometry=IndexedFaceSet(coordIndex=[0,1,5,4,-1,1,2,6,5,-1,2,3,7,6,-1,3,0,4,7,-1,0,8,9,1,-1,9,10,2,1,-1,10,11,3,2,-1,11,8,0,3,-1,15,14,6,7,-1,14,13,5,6,-1,13,12,4,5,-1,12,15,7,4,-1],
          coord=Coordinate(DEF='PlanterCoordinates',point=[(-1.0,0.5,1.0),(1.0,0.5,1.0),(1.0,0.5,-1.0),(-1.0,0.5,-1.0),(-0.8,0.5,0.9),(0.8,0.5,0.9),(0.8,0.5,-0.9),(-0.8,0.5,-0.9),(-1.0,0.0,1.0),(1.0,0.0,1.0),(1.0,0.0,-1.0),(-1.0,0.0,-1.0),(-0.8,0.3,0.9),(0.8,0.3,0.9),(0.8,0.3,-0.9),(-0.8,0.3,-0.9)]))),
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,0.5,0.0))),
        geometry=IndexedFaceSet(coordIndex=[12,13,14,15],
          coord=Coordinate(USE='PlanterCoordinates')))]),
    Transform(translation=(3.5,0.0,0.0),
      children=[
      Transform(USE='Planter'),
      Billboard(
        children=[
        Shape(
          appearance=Appearance(
            texture=ImageTexture(url=["tree1.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tree1.png"])),
          geometry=IndexedFaceSet(DEF='TreeFace',coordIndex=[0,1,2,3],solid=False,texCoordIndex=[0,1,2,3],
            texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(1.0,1.0),(0.0,1.0)]),
            coord=Coordinate(point=[(-1.51,0.05,0.0),(1.51,0.05,0.0),(1.51,3.05,0.0),(-1.51,3.05,0.0)])))])]),
    Transform(
      children=[
      Billboard(DEF='Tree',
        children=[
        Shape(
          appearance=Appearance(
            texture=ImageTexture(url=["tree1.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tree1.jpg"])),
          geometry=IndexedFaceSet(USE='TreeFace'))])]),
    Transform(translation=(-3.5,0.0,0.0),
      children=[
      Transform(USE='Planter'),
      Billboard(
        children=[
        Shape(
          appearance=Appearance(
            material=Material(),),
          geometry=IndexedFaceSet(USE='TreeFace'))])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for TreeWall.py:')
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

print("python TreeWall.py load and self-test diagnostics complete.")
