####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Temple.py
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
    meta(content='Temple.x3d',name='title'),
    meta(content='Temple of the Glowing Orb: this world creates a glowing rotating orb when the pedestal is touched.',name='description'),
    meta(content='David R. Nadeau, John L. Moreland, Michael M. Heck',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/temple.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0008.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0309.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0383.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Temple.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  The orb animations include: 
    #  1. An OrientationInterpolator rotating an inner emissive textured sphere. 
    #  2. An OrientationInterpolator rotating an outer emissive textured semi-transparent sphere. 
    #  3. An OrientationInterpolator rotating a pair of rings, angled at a 45 degree angle. 
    #  4. An OrientationInterpolator rotating a second pair of rings, angled at a 45 degree angle. 
    #  A ScalarInterpolator with semi-random floating point keyValue that are routed in to a PointLight, thereby causing a flickering effect. That effect is turned on only after the pedestal has been touched. 
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Temple of the Orb'),
    Viewpoint(description='Entry view',position=(0.0,1.6,9.0)),
    NavigationInfo(headlight=False,speed=2.0,type='"WALK" "ANY"'),
    Background(skyAngle=[1.371,1.571],skyColor=[(0.0,0.1,0.2),(0.0,0.1,0.3),(0.0,0.0,0.0)]),
    PointLight(DEF='OrbLight',color=(0.3,0.7,1.0),intensity=0.0,location=(0.0,2.0,0.0)),
    DirectionalLight(color=(1.0,0.5,0.0),direction=(1.0,0.1,-0.5)),
    DirectionalLight(color=(1.0,0.5,0.0),direction=(1.0,0.1,-0.5)),
    DirectionalLight(color=(1.0,0.0,0.0),direction=(-1.0,-0.4,-0.5)),
    DirectionalLight(color=(1.0,0.0,0.0),direction=(-1.0,-0.4,-0.5)),
    Transform(translation=(0.0,3.64,0.0),
      children=[
      Group(DEF='VaultedCeiling',
        children=[
        Inline(DEF='Vault',url=["vault.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/vault.x3d","vault.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/vault.wrl"]),
        Transform(rotation=(0.0,1.0,0.0,1.57),
          children=[
          Inline(USE='Vault')]),
        Transform(rotation=(0.0,1.0,0.0,3.14),
          children=[
          Inline(USE='Vault')]),
        Transform(rotation=(0.0,1.0,0.0,-1.57),
          children=[
          Inline(USE='Vault')])]),
      Transform(translation=(-2.0,0.0,0.0),
        children=[
        Group(USE='VaultedCeiling')]),
      Transform(translation=(2.0,0.0,0.0),
        children=[
        Group(USE='VaultedCeiling')]),
      Transform(translation=(0.0,0.0,-2.0),
        children=[
        Group(USE='VaultedCeiling')]),
      Transform(translation=(0.0,0.0,2.0),
        children=[
        Group(USE='VaultedCeiling')])]),
    Transform(translation=(-3.0,0.0,-1.0),
      children=[
      Transform(DEF='Column',scale=(0.5,0.7,0.5),
        children=[
        Inline(url=["column.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/column.x3d","column.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/column.wrl"])])]),
    Transform(translation=(-1.0,0.0,-1.0),
      children=[
      Transform(USE='Column')]),
    Transform(translation=(1.0,0.0,-1.0),
      children=[
      Transform(USE='Column')]),
    Transform(translation=(3.0,0.0,-1.0),
      children=[
      Transform(USE='Column')]),
    Transform(translation=(-3.0,0.0,1.0),
      children=[
      Transform(USE='Column')]),
    Transform(translation=(-1.0,0.0,1.0),
      children=[
      Transform(USE='Column')]),
    Transform(translation=(1.0,0.0,1.0),
      children=[
      Transform(USE='Column')]),
    Transform(translation=(3.0,0.0,1.0),
      children=[
      Transform(USE='Column')]),
    Transform(translation=(-1.0,0.0,-3.0),
      children=[
      Transform(USE='Column')]),
    Transform(translation=(-1.0,0.0,3.0),
      children=[
      Transform(USE='Column')]),
    Transform(translation=(1.0,0.0,-3.0),
      children=[
      Transform(USE='Column')]),
    Transform(translation=(1.0,0.0,3.0),
      children=[
      Transform(USE='Column')]),
    Transform(translation=(-11.5,0.0,-11.5),
      children=[
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(16.0,16.0)),
          material=Material(ambientIntensity=0.5,diffuseColor=(1.0,1.0,1.0)),
          texture=ImageTexture(url=["stone2.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/stone2.jpg"])),
        geometry=ElevationGrid(height=[0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],solid=False,xDimension=8,xSpacing=3.0,zDimension=8,zSpacing=3.0))]),
    Collision(enabled=False,
      children=[
      Transform(DEF='OrbAll',scale=(0.01,0.01,0.01),translation=(0.0,1.625,0.0),
        children=[
        Transform(rotation=(0.0,0.0,1.0,0.785),
          children=[
          Transform(DEF='RingSet1',
            children=[
            Transform(DEF='Ring1',rotation=(0.0,0.0,1.0,0.35),translation=(0.0,0.0525,0.0),
              children=[
              Shape(DEF='Ring',
                appearance=Appearance(
                  material=Material(ambientIntensity=0.0,diffuseColor=(0.0,0.0,0.0),emissiveColor=(0.0,0.3,0.8),shininess=1.0,specularColor=(0.0,0.1,0.1))),
                geometry=Cylinder(bottom=False,height=0.008,radius=0.15,top=False))]),
            Transform(DEF='Ring2',rotation=(0.0,0.0,1.0,-0.35),translation=(0.0,-0.0525,0.0),
              children=[
              Shape(USE='Ring')])])]),
        Transform(rotation=(0.0,0.0,1.0,-0.785),
          children=[
          Transform(DEF='RingSet2',scale=(0.9,0.9,0.9),
            children=[
            Transform(USE='Ring1'),
            Transform(USE='Ring2')])]),
        Transform(DEF='Orb',
          children=[
          Shape(
            appearance=Appearance(
              textureTransform=TextureTransform(scale=(2.0,2.0)),
              texture=ImageTexture(url=["brtsky.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/brtsky.jpg"])),
            geometry=Sphere(radius=0.1))])])]),
    Transform(translation=(0.0,1.625,0.0),
      children=[
      Sound(DEF='OrbSound',intensity=0.0,maxBack=15.0,maxFront=15.0,
        source=AudioClip(DEF='OrbClip',startTime=-1.0,url=["willow1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/willow1.wav"]))]),
    Collision(enabled=False,
      children=[
      Transform(scale=(3.25,3.25,3.25),translation=(0.0,0.015,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(DEF='GranitMaterial',ambientIntensity=0.0,diffuseColor=(0.8,0.8,1.0)),
            texture=ImageTexture(DEF='GranitTexture',url=["granit_g.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/granit_g.jpg"])),
          geometry=IndexedFaceSet(coordIndex=[0,1,4,-1,1,2,4,-1,2,3,4,-1,3,0,4,-1],texCoordIndex=[0,1,2,-1,0,1,2,-1,0,1,2,-1,0,1,2,-1],
            texCoord=TextureCoordinate(point=[(0.0,0.0),(1.0,0.0),(0.5,1.0)]),
            coord=Coordinate(point=[(-0.06,0.0,0.06),(0.06,0.0,0.06),(0.06,0.0,-0.06),(-0.06,0.0,-0.06),(0.0,0.3,0.0)]))),
        TouchSensor(DEF='PedestalTouch',description='Touch center pedestal to see and hear the orb')]),
      Transform(scale=(3.25,3.25,3.25),translation=(0.0,0.008,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(USE='GranitMaterial'),
            texture=ImageTexture(USE='GranitTexture')),
          geometry=Box(size=(0.2,0.025,0.2)))])]),
    TimeSensor(DEF='OrbTimer',cycleInterval=20.0,loop=True,startTime=-1.0),
    OrientationInterpolator(DEF='OrbRotator',key=[0.0,0.5,1.0],keyValue=[(0.0,1.0,0.0,0.0),(0.0,1.0,0.0,3.14),(0.0,1.0,0.0,6.28)]),
    ROUTE(fromField='fraction_changed',fromNode='OrbTimer',toField='set_fraction',toNode='OrbRotator'),
    ROUTE(fromField='value_changed',fromNode='OrbRotator',toField='set_rotation',toNode='Orb'),
    TimeSensor(DEF='RingSet1Timer',cycleInterval=2.0,loop=True,startTime=-1.0),
    TimeSensor(DEF='RingSet2Timer',cycleInterval=2.2,loop=True,startTime=-1.0),
    OrientationInterpolator(DEF='RingSet1Rotator',key=[0.0,0.5,1.0],keyValue=[(0.0,1.0,0.0,0.0),(0.0,1.0,0.0,-3.14),(0.0,1.0,0.0,-6.28)]),
    ROUTE(fromField='fraction_changed',fromNode='RingSet1Timer',toField='set_fraction',toNode='RingSet1Rotator'),
    ROUTE(fromField='value_changed',fromNode='RingSet1Rotator',toField='set_rotation',toNode='RingSet1'),
    OrientationInterpolator(DEF='RingSet2Rotator',key=[0.0,0.5,1.0],keyValue=[(0.0,1.0,0.0,0.0),(0.0,1.0,0.0,3.14),(0.0,1.0,0.0,6.28)]),
    ROUTE(fromField='fraction_changed',fromNode='RingSet2Timer',toField='set_fraction',toNode='RingSet2Rotator'),
    ROUTE(fromField='value_changed',fromNode='RingSet2Rotator',toField='set_rotation',toNode='RingSet2'),
    TimeSensor(DEF='OrbLightTimer',cycleInterval=12.0,startTime=-1.0),
    ScalarInterpolator(DEF='OrbLightIntensity',key=[0.0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0],keyValue=[0.0,0.5,0.7,1.0,0.9,0.8,1.0,0.9,0.9,0.5,0.0]),
    ROUTE(fromField='fraction_changed',fromNode='OrbLightTimer',toField='set_fraction',toNode='OrbLightIntensity'),
    ROUTE(fromField='value_changed',fromNode='OrbLightIntensity',toField='set_intensity',toNode='OrbLight'),
    TimeSensor(DEF='OrbScaleTimer',cycleInterval=12.0,startTime=-1.0),
    PositionInterpolator(DEF='OrbScaler',key=[0.0,0.3,0.9,1.0],keyValue=[(0.001,0.001,0.001),(3.25,3.25,3.25),(3.25,3.25,3.25),(0.001,0.001,0.001)]),
    ScalarInterpolator(DEF='OrbVolume',key=[0.0,0.3,0.9,1.0],keyValue=[0.0,1.0,1.0,0.0]),
    ROUTE(fromField='touchTime',fromNode='PedestalTouch',toField='set_startTime',toNode='OrbScaleTimer'),
    ROUTE(fromField='touchTime',fromNode='PedestalTouch',toField='set_startTime',toNode='OrbLightTimer'),
    ROUTE(fromField='touchTime',fromNode='PedestalTouch',toField='set_startTime',toNode='OrbClip'),
    ROUTE(fromField='touchTime',fromNode='PedestalTouch',toField='set_startTime',toNode='OrbTimer'),
    ROUTE(fromField='touchTime',fromNode='PedestalTouch',toField='set_startTime',toNode='RingSet1Timer'),
    ROUTE(fromField='touchTime',fromNode='PedestalTouch',toField='set_startTime',toNode='RingSet2Timer'),
    ROUTE(fromField='fraction_changed',fromNode='OrbScaleTimer',toField='set_fraction',toNode='OrbScaler'),
    ROUTE(fromField='fraction_changed',fromNode='OrbScaleTimer',toField='set_fraction',toNode='OrbVolume'),
    ROUTE(fromField='value_changed',fromNode='OrbScaler',toField='set_scale',toNode='OrbAll'),
    ROUTE(fromField='value_changed',fromNode='OrbVolume',toField='set_intensity',toNode='OrbSound')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Temple.py:')
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

print("python Temple.py load and self-test diagnostics complete.")
