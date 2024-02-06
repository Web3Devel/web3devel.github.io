####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Proximity2.py
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
    meta(content='Proximity2.x3d',name='title'),
    meta(content='Proximity pillars example illustrates the use of proximity sensors to sense when the user gets close, and trigger animations or sounds.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/prox2.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0376.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Proximity2.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Proximity pillars'),
    Viewpoint(description='Entry view',orientation=(0.0,1.0,0.0,0.785),position=(7.5,1.7,7.5)),
    NavigationInfo(headlight=False,speed=3.0),
    Background(skyAngle=[1.57,1.87],skyColor=[(0.0,0.0,0.0),(0.0,0.0,0.0),(1.0,1.0,1.0)]),
    Fog(color=(0.1,0.1,0.1),visibilityRange=18.0),
    DirectionalLight(direction=(-1.0,-0.5,-0.5)),
    Shape(
      appearance=Appearance(
        textureTransform=TextureTransform(scale=(16.0,16.0)),
        texture=ImageTexture(url=["grill.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/grill.png"])),
      geometry=IndexedFaceSet(coordIndex=[0,1,2,3],texCoordIndex=[0,1,2,3],
        texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(1.0,1.0),(0.0,1.0)]),
        coord=Coordinate(point=[(-16.0,0.0,16.0),(16.0,0.0,16.0),(16.0,0.0,-16.0),(-16.0,0.0,-16.0)]))),
    Sound(maxBack=100.0,maxFront=100.0,minBack=100.0,minFront=100.0,
      source=AudioClip(DEF='Bonk',stopTime=1.0,url=["dropbrk.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/dropbrk.wav"])),
    Collision(DEF='HitBar1',
      children=[
      Transform(translation=(-2.0,0.0,2.0),
        children=[
        ProximitySensor(DEF='NearBar1',size=(14.0,14.0,14.0)),
        Shape(
          appearance=Appearance(
            material=Material(DEF='MaterialBar1',diffuseColor=(0.0,0.3,1.0),transparency=1.0)),
          geometry=IndexedFaceSet(coordIndex=[0,1,5,4,-1,1,2,6,5,-1,2,3,7,6,-1,3,0,4,7,-1,4,5,6,7,-1],
            coord=Coordinate(point=[(-0.5,0.0,0.5),(0.5,0.0,0.5),(0.5,0.0,-0.5),(-0.5,0.0,-0.5),(-0.5,4.0,0.5),(0.5,4.0,0.5),(0.5,4.0,-0.5),(-0.5,4.0,-0.5)])))])]),
    TimeSensor(DEF='ClockOnBar1',stopTime=1.0),
    TimeSensor(DEF='ClockOffBar1',stopTime=1.0),
    ScalarInterpolator(DEF='OnBar1',key=[0.0,1.0],keyValue=[1.0,0.0]),
    ScalarInterpolator(DEF='OffBar1',key=[0.0,1.0],keyValue=[0.0,1.0]),
    ROUTE(fromField='enterTime',fromNode='NearBar1',toField='set_startTime',toNode='ClockOnBar1'),
    ROUTE(fromField='exitTime',fromNode='NearBar1',toField='set_startTime',toNode='ClockOffBar1'),
    ROUTE(fromField='fraction_changed',fromNode='ClockOnBar1',toField='set_fraction',toNode='OnBar1'),
    ROUTE(fromField='fraction_changed',fromNode='ClockOffBar1',toField='set_fraction',toNode='OffBar1'),
    ROUTE(fromField='value_changed',fromNode='OnBar1',toField='set_transparency',toNode='MaterialBar1'),
    ROUTE(fromField='value_changed',fromNode='OffBar1',toField='set_transparency',toNode='MaterialBar1'),
    ROUTE(fromField='collideTime',fromNode='HitBar1',toField='set_startTime',toNode='Bonk'),
    Collision(DEF='HitBar2',
      children=[
      Transform(translation=(4.0,0.0,0.0),
        children=[
        ProximitySensor(DEF='NearBar2',size=(14.0,14.0,14.0)),
        Shape(
          appearance=Appearance(
            material=Material(DEF='MaterialBar2',diffuseColor=(0.0,1.0,0.0),transparency=1.0)),
          geometry=IndexedFaceSet(coordIndex=[0,1,5,4,-1,1,2,6,5,-1,2,3,7,6,-1,3,0,4,7,-1,4,5,6,7,-1],
            coord=Coordinate(point=[(-0.5,0.0,0.5),(0.5,0.0,0.5),(0.5,0.0,-0.5),(-0.5,0.0,-0.5),(-0.5,2.0,0.5),(0.5,2.0,0.5),(0.5,2.0,-0.5),(-0.5,2.0,-0.5)])))])]),
    TimeSensor(DEF='ClockOnBar2',stopTime=1.0),
    TimeSensor(DEF='ClockOffBar2',stopTime=1.0),
    ScalarInterpolator(DEF='OnBar2',key=[0.0,1.0],keyValue=[1.0,0.0]),
    ScalarInterpolator(DEF='OffBar2',key=[0.0,1.0],keyValue=[0.0,1.0]),
    ROUTE(fromField='enterTime',fromNode='NearBar2',toField='set_startTime',toNode='ClockOnBar2'),
    ROUTE(fromField='exitTime',fromNode='NearBar2',toField='set_startTime',toNode='ClockOffBar2'),
    ROUTE(fromField='fraction_changed',fromNode='ClockOnBar2',toField='set_fraction',toNode='OnBar2'),
    ROUTE(fromField='fraction_changed',fromNode='ClockOffBar2',toField='set_fraction',toNode='OffBar2'),
    ROUTE(fromField='value_changed',fromNode='OnBar2',toField='set_transparency',toNode='MaterialBar2'),
    ROUTE(fromField='value_changed',fromNode='OffBar2',toField='set_transparency',toNode='MaterialBar2'),
    ROUTE(fromField='collideTime',fromNode='HitBar2',toField='set_startTime',toNode='Bonk'),
    Collision(DEF='HitBar3',
      children=[
      Transform(translation=(-4.0,0.0,-4.0),
        children=[
        ProximitySensor(DEF='NearBar3',size=(14.0,14.0,14.0)),
        Shape(
          appearance=Appearance(
            material=Material(DEF='MaterialBar3',diffuseColor=(1.0,1.0,0.0),transparency=1.0)),
          geometry=IndexedFaceSet(coordIndex=[0,1,5,4,-1,1,2,6,5,-1,2,3,7,6,-1,3,0,4,7,-1,4,5,6,7,-1],
            coord=Coordinate(point=[(-0.5,0.0,0.5),(0.5,0.0,0.5),(0.5,0.0,-0.5),(-0.5,0.0,-0.5),(-0.5,4.0,0.5),(0.5,4.0,0.5),(0.5,4.0,-0.5),(-0.5,4.0,-0.5)])))])]),
    TimeSensor(DEF='ClockOnBar3',stopTime=1.0),
    TimeSensor(DEF='ClockOffBar3',stopTime=1.0),
    ScalarInterpolator(DEF='OnBar3',key=[0.0,1.0],keyValue=[1.0,0.0]),
    ScalarInterpolator(DEF='OffBar3',key=[0.0,1.0],keyValue=[0.0,1.0]),
    ROUTE(fromField='enterTime',fromNode='NearBar3',toField='set_startTime',toNode='ClockOnBar3'),
    ROUTE(fromField='exitTime',fromNode='NearBar3',toField='set_startTime',toNode='ClockOffBar3'),
    ROUTE(fromField='fraction_changed',fromNode='ClockOnBar3',toField='set_fraction',toNode='OnBar3'),
    ROUTE(fromField='fraction_changed',fromNode='ClockOffBar3',toField='set_fraction',toNode='OffBar3'),
    ROUTE(fromField='value_changed',fromNode='OnBar3',toField='set_transparency',toNode='MaterialBar3'),
    ROUTE(fromField='value_changed',fromNode='OffBar3',toField='set_transparency',toNode='MaterialBar3'),
    ROUTE(fromField='collideTime',fromNode='HitBar3',toField='set_startTime',toNode='Bonk'),
    Collision(DEF='HitBar4',
      children=[
      Transform(translation=(2.0,0.0,-2.0),
        children=[
        ProximitySensor(DEF='NearBar4',size=(14.0,14.0,14.0)),
        Shape(
          appearance=Appearance(
            material=Material(DEF='MaterialBar4',diffuseColor=(1.0,0.0,0.0),transparency=1.0)),
          geometry=IndexedFaceSet(coordIndex=[0,1,5,4,-1,1,2,6,5,-1,2,3,7,6,-1,3,0,4,7,-1,4,5,6,7,-1],
            coord=Coordinate(point=[(-0.5,0.0,0.5),(0.5,0.0,0.5),(0.5,0.0,-0.5),(-0.5,0.0,-0.5),(-0.5,3.0,0.5),(0.5,3.0,0.5),(0.5,3.0,-0.5),(-0.5,3.0,-0.5)])))])]),
    TimeSensor(DEF='ClockOnBar4',stopTime=1.0),
    TimeSensor(DEF='ClockOffBar4',stopTime=1.0),
    ScalarInterpolator(DEF='OnBar4',key=[0.0,1.0],keyValue=[1.0,0.0]),
    ScalarInterpolator(DEF='OffBar4',key=[0.0,1.0],keyValue=[0.0,1.0]),
    ROUTE(fromField='enterTime',fromNode='NearBar4',toField='set_startTime',toNode='ClockOnBar4'),
    ROUTE(fromField='exitTime',fromNode='NearBar4',toField='set_startTime',toNode='ClockOffBar4'),
    ROUTE(fromField='fraction_changed',fromNode='ClockOnBar4',toField='set_fraction',toNode='OnBar4'),
    ROUTE(fromField='fraction_changed',fromNode='ClockOffBar4',toField='set_fraction',toNode='OffBar4'),
    ROUTE(fromField='value_changed',fromNode='OnBar4',toField='set_transparency',toNode='MaterialBar4'),
    ROUTE(fromField='value_changed',fromNode='OffBar4',toField='set_transparency',toNode='MaterialBar4'),
    ROUTE(fromField='collideTime',fromNode='HitBar4',toField='set_startTime',toNode='Bonk')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Proximity2.py:')
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

print("python Proximity2.py load and self-test diagnostics complete.")
