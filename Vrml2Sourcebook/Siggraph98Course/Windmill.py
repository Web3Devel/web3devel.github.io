####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Windmill.py
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
    meta(content='Windmill.x3d',name='title'),
    meta(content='This world builds a windmill whose sails spin about. Several viewpoints are added to look at the windmill from different angles.',name='description'),
    meta(content='David R. Nadeau, John L. Moreland, Michael M. Heck',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/windmill.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0356.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Windmill.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  EXPERIMENTATION 
    #  Add additional windmills to the world. Make each windmill's sails rotate at a slightly different speed. This will insure that the windmills don't all rotate in sync, thereby making the scene look more natural. 
    #  Make the windmill door an anchor. Clicking on the door leads to another world describing the windmill interior. 
    #  Add panorama cloud and mountain textures to the Background node. 
    #  Remove the windmill's sails and, instead, create a rotating water wheel. 
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Windmill'),
    Viewpoint(description='Entry view',orientation=(1.0,0.0,0.0,0.2),position=(0.0,1.65,35.0)),
    Viewpoint(description='Close-up',orientation=(1.0,0.0,0.0,0.5),position=(0.0,1.65,15.0)),
    Viewpoint(description='Front door',orientation=(0.0,1.0,0.0,0.785),position=(7.05,1.65,7.05)),
    Viewpoint(description='Far away',orientation=(0.0,1.0,0.0,2.356),position=(35.0,1.65,-35.0)),
    Viewpoint(description='Roof top',orientation=(0.00128,0.959,0.282,3.1503),position=(0.0,14.43,2.0)),
    NavigationInfo(headlight=False,speed=3.0),
    Background(skyAngle=[1.3,1.471],skyColor=[(0.0,0.2,0.8),(0.1,0.3,0.9),(0.7,0.7,0.7)]),
    DirectionalLight(ambientIntensity=0.8,direction=(-1.0,-1.0,-1.0)),
    Transform(translation=(0.0,-0.005,0.0),
      children=[
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(2.0,2.0)),
          material=Material(ambientIntensity=0.7,diffuseColor=(0.0,0.5,0.1)),
          texture=ImageTexture(url=["fire_g.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/fire_g.jpg"])),
        geometry=IndexedFaceSet(coordIndex=[0,1,2,3],texCoordIndex=[0,1,2,3],
          texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(1.0,1.0),(0.0,1.0)]),
          coord=Coordinate(point=[(-100.0,0.0,100.0),(100.0,0.0,100.0),(100.0,0.0,-100.0),(-100.0,0.0,-100.0)])))]),
    Transform(translation=(0.0,5.0,0.0),
      children=[
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(2.0,2.0)),
          material=Material(ambientIntensity=0.3,diffuseColor=(1.0,1.0,1.0)),
          texture=ImageTexture(url=["swall1.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/swall1.jpg"])),
        geometry=Cylinder(bottom=False,height=10.0,radius=5.0,top=False))]),
    Transform(translation=(0.0,12.0,0.0),
      children=[
      Shape(
        appearance=Appearance(DEF='Tile',
          textureTransform=TextureTransform(scale=(4.0,4.0)),
          material=Material(ambientIntensity=0.3,diffuseColor=(0.8,0.0,0.0)),
          texture=ImageTexture(url=["wtile.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/wtile.jpg"])),
        geometry=Cone(bottomRadius=6.0,height=4.0))]),
    Transform(rotation=(0.0,1.0,0.0,0.785),translation=(3.55,0.0,3.55),
      children=[
      Transform(translation=(0.0,3.6,0.0),
        children=[
        Shape(
          appearance=Appearance(USE='Tile'),
          geometry=Cone(bottomRadius=1.5))]),
      Shape(
        appearance=Appearance(
          material=Material(ambientIntensity=0.3,diffuseColor=(0.4,0.2,0.0)),
          texture=ImageTexture(url=["wdoor.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/wdoor.jpg"])),
        geometry=IndexedFaceSet(coordIndex=[0,1,2,3,-1,4,0,3,7,-1,1,5,6,2,-1],texCoordIndex=[0,1,2,3,-1,4,5,6,7,-1,4,5,6,7,-1],
          texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(1.0,1.0),(0.0,1.0),(0.0,0.0),(0.08,0.0),(0.08,1.0),(0.0,1.0)]),
          coord=Coordinate(point=[(-0.7,0.0,0.15),(0.7,0.0,0.15),(0.7,2.9,0.15),(-0.7,2.9,0.15),(-0.7,0.0,-0.05),(0.7,0.0,-0.05),(0.7,2.9,-0.05),(-0.7,2.9,-0.05)]))),
      Transform(translation=(0.0,0.05,0.5),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.4,0.4,0.4))),
          geometry=Box(size=(2.0,0.1,1.0)))])]),
    Transform(DEF='Sails',translation=(0.0,8.0,6.5),
      children=[
      Viewpoint(description='On a sail',position=(0.0,6.5,-0.1)),
      Transform(rotation=(1.0,0.0,0.0,1.571),translation=(0.0,0.0,-0.75),
        children=[
        Shape(
          appearance=Appearance(DEF='Wood',
            material=Material(diffuseColor=(0.6,0.4,0.0))),
          geometry=Cylinder(bottom=False,height=1.5,radius=0.8))]),
      Transform(DEF='Sail',translation=(0.0,3.5,0.1),
        children=[
        Transform(translation=(0.0,1.0,0.1),
          children=[
          Shape(
            appearance=Appearance(
              textureTransform=TextureTransform(scale=(2.0,6.0)),
              material=Material(diffuseColor=(1.0,1.0,1.0)),
              texture=ImageTexture(url=["sails.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/sails.jpg"])),
            geometry=Box(size=(2.0,6.0,0.1)))]),
        Shape(
          appearance=Appearance(USE='Wood'),
          geometry=Box(size=(0.1,7.0,0.1)))]),
      Transform(rotation=(0.0,0.0,1.0,1.571),
        children=[
        Transform(USE='Sail')]),
      Transform(rotation=(0.0,0.0,1.0,-1.571),
        children=[
        Transform(USE='Sail')]),
      Transform(rotation=(0.0,0.0,1.0,3.141),
        children=[
        Transform(USE='Sail')])]),
    TimeSensor(DEF='Clock',cycleInterval=10.0,loop=True,startTime=1.0),
    OrientationInterpolator(DEF='Rotator',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,3.141),(0.0,0.0,1.0,6.282)]),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='Rotator'),
    ROUTE(fromField='value_changed',fromNode='Rotator',toField='set_rotation',toNode='Sails')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Windmill.py:')
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

print("python Windmill.py load and self-test diagnostics complete.")
