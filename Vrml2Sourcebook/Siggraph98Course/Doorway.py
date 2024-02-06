####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Doorway.py
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
    meta(content='Doorway.x3d',name='title'),
    meta(content='The Doorway scene consists of four sliding stairs that lead forward along a path to a glowing white doorway.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/doorway.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0383.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Doorway.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  A ProximitySensor routes to four TimeSensors, one per sliding stair. Each stair's timer routes to a PositionInterpolator that outputs varying positions side-to-side along the X axis. The PositionInterpolator's positions are routed into translation fields for Transform nodes surrounding each stair. 
    #  By using different starting positions, the four stairs are made to slide back and forth in a pattern. 
    #  Things to experiment with: 
    #  Add sound! Perhaps the crackling of fire below and the grinding sliding sounds of the stone stairs. 
    #  Use a ScalarInterpolator to flicker the red light as if there is fire below. 
    #  Surround the doorway with an Anchor node that leads somewhere! 
    #  Place a ProximitySensor around the doorway. As you approach it, the ProximitySensor triggers an OrientationInterpolator which slowly rotates the door open. The open door reveals ... ! 
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='The Doorway'),
    Viewpoint(DEF='Entry',description='Entry view',position=(0.0,3.1,10.0)),
    NavigationInfo(avatarSize=[0.5,3.0,1.5],headlight=False,type='"WALK" "ANY"'),
    ProximitySensor(DEF='Proximity',size=(10.0,10.0,50.0)),
    Background(skyAngle=[1.47,1.67],skyColor=[(0.0,0.0,0.0),(0.0,0.0,0.0),(1.0,0.0,0.0)]),
    DirectionalLight(ambientIntensity=0.5,color=(0.0,0.3,1.0),direction=(1.0,-1.0,-3.0)),
    DirectionalLight(ambientIntensity=0.3,color=(1.0,0.0,0.0),direction=(-1.0,2.5,-1.0)),
    DirectionalLight(color=(1.0,0.0,0.0),direction=(-1.0,2.5,-1.0)),
    Transform(translation=(0.0,-0.5,8.0),
      children=[
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(0.5,0.5)),
          material=Material(),
          texture=ImageTexture(DEF='Granit',url=["granit_g.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/granit_g.jpg"])),
        geometry=Box(size=(4.0,0.4,16.0)))]),
    Transform(DEF='Stair1',
      children=[
      Inline(DEF='Stair',url=["Tread.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Tread.x3d","Tread.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Tread.wrl"])]),
    Transform(translation=(-1.0,0.5,-2.0),
      children=[
      Transform(DEF='Stair2',
        children=[
        Inline(USE='Stair')])]),
    Transform(translation=(1.5,1.0,-4.0),
      children=[
      Transform(DEF='Stair3',
        children=[
        Inline(USE='Stair')])]),
    Transform(translation=(0.0,1.5,-6.0),
      children=[
      Transform(DEF='Stair4',
        children=[
        Inline(USE='Stair')])]),
    Transform(translation=(0.0,2.0,-8.0),
      children=[
      Inline(USE='Stair')]),
    Transform(scale=(0.7,0.7,0.7),translation=(0.0,2.0,-10.0),
      children=[
      Inline(url=["GlowDoor.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/GlowDoor.x3d","GlowDoor.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/GlowDoor.wrl"])]),
    Transform(rotation=(0.0,0.0,1.0,0.785),translation=(-2.0,6.0,-10.0),
      children=[
      Shape(DEF='ArchBox',
        appearance=Appearance(
          material=Material(ambientIntensity=0.0,diffuseColor=(1.0,1.0,1.0),emissiveColor=(0.4,0.4,0.4)),
          texture=ImageTexture(url=["marble_g.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/marble_g.jpg"])),
        geometry=Box(size=(4.0,0.2,2.0))),
      Transform(translation=(1.0,0.2,1.0),
        children=[
        Shape(USE='ArchBox')]),
      Transform(translation=(2.0,0.4,2.0),
        children=[
        Shape(USE='ArchBox')])]),
    Transform(rotation=(0.0,0.0,1.0,-0.785),translation=(2.0,6.0,-10.0),
      children=[
      Shape(USE='ArchBox'),
      Transform(translation=(-1.0,0.2,1.0),
        children=[
        Shape(USE='ArchBox')]),
      Transform(translation=(-2.0,0.4,2.0),
        children=[
        Shape(USE='ArchBox')])]),
    TimeSensor(DEF='Stair1Timer',cycleInterval=4.0,loop=True),
    PositionInterpolator(DEF='Stair1Path',key=[0.0,0.25,0.5,0.75,1.0],keyValue=[(0.0,0.0,0.0),(3.0,0.0,0.0),(0.0,0.0,0.0),(-3.0,0.0,0.0),(0.0,0.0,0.0)]),
    ROUTE(fromField='enterTime',fromNode='Proximity',toField='set_startTime',toNode='Stair1Timer'),
    ROUTE(fromField='fraction_changed',fromNode='Stair1Timer',toField='set_fraction',toNode='Stair1Path'),
    ROUTE(fromField='value_changed',fromNode='Stair1Path',toField='set_translation',toNode='Stair1'),
    TimeSensor(DEF='Stair2Timer',cycleInterval=4.0,loop=True),
    PositionInterpolator(DEF='Stair2Path',key=[0.0,0.25,0.5,0.75,1.0],keyValue=[(3.0,0.0,0.0),(0.0,0.0,0.0),(-3.0,0.0,0.0),(0.0,0.0,0.0),(3.0,0.0,0.0)]),
    ROUTE(fromField='enterTime',fromNode='Proximity',toField='set_startTime',toNode='Stair2Timer'),
    ROUTE(fromField='fraction_changed',fromNode='Stair2Timer',toField='set_fraction',toNode='Stair2Path'),
    ROUTE(fromField='value_changed',fromNode='Stair2Path',toField='set_translation',toNode='Stair2'),
    TimeSensor(DEF='Stair3Timer',cycleInterval=4.0,loop=True),
    PositionInterpolator(DEF='Stair3Path',key=[0.0,0.25,0.5,0.75,1.0],keyValue=[(-3.0,0.0,0.0),(0.0,0.0,0.0),(3.0,0.0,0.0),(0.0,0.0,0.0),(-3.0,0.0,0.0)]),
    ROUTE(fromField='enterTime',fromNode='Proximity',toField='set_startTime',toNode='Stair3Timer'),
    ROUTE(fromField='fraction_changed',fromNode='Stair3Timer',toField='set_fraction',toNode='Stair3Path'),
    ROUTE(fromField='value_changed',fromNode='Stair3Path',toField='set_translation',toNode='Stair3'),
    TimeSensor(DEF='Stair4Timer',cycleInterval=4.0,loop=True),
    PositionInterpolator(DEF='Stair4Path',key=[0.0,0.25,0.5,0.75,1.0],keyValue=[(0.0,0.0,0.0),(-3.0,0.0,0.0),(0.0,0.0,0.0),(3.0,0.0,0.0),(0.0,0.0,0.0)]),
    ROUTE(fromField='enterTime',fromNode='Proximity',toField='set_startTime',toNode='Stair4Timer'),
    ROUTE(fromField='fraction_changed',fromNode='Stair4Timer',toField='set_fraction',toNode='Stair4Path'),
    ROUTE(fromField='value_changed',fromNode='Stair4Path',toField='set_translation',toNode='Stair4')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Doorway.py:')
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

print("python Doorway.py load and self-test diagnostics complete.")
