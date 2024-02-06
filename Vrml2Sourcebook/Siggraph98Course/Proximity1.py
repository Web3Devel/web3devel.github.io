####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Proximity1.py
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
    meta(content='Proximity1.x3d',name='title'),
    meta(content='Proximity door illustrates the use of a ProximitySensor node around a door. When the traveler gets near that door, an animation is triggered that opens the door and plays a sound. When the traveler leaves the area, the door closes and another sound is played.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/prox1.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0376.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0389.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Proximity1.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Proximity door'),
    Viewpoint(description='Entry view',position=(0.0,1.6,7.0)),
    NavigationInfo(avatarSize=[1.0,1.6,0.75],headlight=False,speed=4.0,type='"WALK" "ANY"'),
    Inline(url=["DungeonRoom.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/DungeonRoom.x3d","DungeonRoom.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/DungeonRoom.wrl"]),
    Transform(translation=(0.0,0.0,-5.0),
      children=[
      Inline(url=["DungeonWall2.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/DungeonWall2.x3d","DungeonWall2.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/DungeonWall2.wrl"])]),
    Transform(translation=(0.0,0.0,-4.95),
      children=[
      Transform(DEF='LeftDoor',
        children=[
        Transform(translation=(-0.75,0.0,0.0),
          children=[
          Inline(DEF='Door',url=["DungeonDoor.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/DungeonDoor.x3d","DungeonDoor.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/DungeonDoor.wrl"])])]),
      Transform(DEF='RightDoor',
        children=[
        Transform(translation=(0.75,0.0,0.0),
          children=[
          Inline(USE='Door')])]),
      ProximitySensor(DEF='DoorSense',center=(0.0,1.75,0.0),size=(6.0,3.5,8.0))]),
    Sound(maxBack=60.0,maxFront=60.0,minBack=20.0,minFront=20.0,
      source=AudioClip(DEF='OpenSound',url=["clunk2.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/clunk2.wav"])),
    Sound(maxBack=60.0,maxFront=60.0,minBack=20.0,minFront=20.0,
      source=AudioClip(DEF='CloseSound',url=["clunk1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/clunk1.wav"])),
    TimeSensor(DEF='OpenClock',cycleInterval=0.5,stopTime=1.0),
    TimeSensor(DEF='CloseClock',cycleInterval=0.5,stopTime=1.0),
    PositionInterpolator(DEF='LeftOpen',key=[0.0,1.0],keyValue=[(0.0,0.0,0.0),(-1.3,0.0,0.0)]),
    PositionInterpolator(DEF='LeftClose',key=[0.0,1.0],keyValue=[(-1.3,0.0,0.0),(0.0,0.0,0.0)]),
    PositionInterpolator(DEF='RightOpen',key=[0.0,1.0],keyValue=[(0.0,0.0,0.0),(1.3,0.0,0.0)]),
    PositionInterpolator(DEF='RightClose',key=[0.0,1.0],keyValue=[(1.3,0.0,0.0),(0.0,0.0,0.0)]),
    ROUTE(fromField='enterTime',fromNode='DoorSense',toField='set_startTime',toNode='OpenSound'),
    ROUTE(fromField='exitTime',fromNode='DoorSense',toField='set_stopTime',toNode='OpenSound'),
    ROUTE(fromField='enterTime',fromNode='DoorSense',toField='set_startTime',toNode='OpenClock'),
    ROUTE(fromField='exitTime',fromNode='DoorSense',toField='set_stopTime',toNode='OpenClock'),
    ROUTE(fromField='exitTime',fromNode='DoorSense',toField='set_startTime',toNode='CloseSound'),
    ROUTE(fromField='enterTime',fromNode='DoorSense',toField='set_stopTime',toNode='CloseSound'),
    ROUTE(fromField='exitTime',fromNode='DoorSense',toField='set_startTime',toNode='CloseClock'),
    ROUTE(fromField='enterTime',fromNode='DoorSense',toField='set_stopTime',toNode='CloseClock'),
    ROUTE(fromField='fraction_changed',fromNode='OpenClock',toField='set_fraction',toNode='LeftOpen'),
    ROUTE(fromField='fraction_changed',fromNode='OpenClock',toField='set_fraction',toNode='RightOpen'),
    ROUTE(fromField='fraction_changed',fromNode='CloseClock',toField='set_fraction',toNode='LeftClose'),
    ROUTE(fromField='fraction_changed',fromNode='CloseClock',toField='set_fraction',toNode='RightClose'),
    ROUTE(fromField='value_changed',fromNode='LeftOpen',toField='set_translation',toNode='LeftDoor'),
    ROUTE(fromField='value_changed',fromNode='LeftClose',toField='set_translation',toNode='LeftDoor'),
    ROUTE(fromField='value_changed',fromNode='RightOpen',toField='set_translation',toNode='RightDoor'),
    ROUTE(fromField='value_changed',fromNode='RightClose',toField='set_translation',toNode='RightDoor')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Proximity1.py:')
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

print("python Proximity1.py load and self-test diagnostics complete.")
