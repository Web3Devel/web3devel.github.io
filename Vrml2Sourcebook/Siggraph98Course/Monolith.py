####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Monolith.py
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
    meta(content='Monolith.x3d',name='title'),
    meta(content='Monolith world: six vertical monoliths stand arranged together. Touching a monolith starts it glowing in a pulsing fashion.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/monolith.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0145.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Monolith.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  TouchSensors on the monoliths route to TimeSensors, one per monolith. Each TimeSensor routes to the intensity field of a PointLight placed just in front of the monolith. Simultaneously, a monolith's TimeSensor routes to the transparency field on a Material for a Box surrounding the monolith. 
    #  As a monolith's TimeSensor fraction ramps up from 0.0 to 1.0, the PointLight intensity ramps up from 0.0 (off) to 1.0 (full on). At the same time, the monolith's outer box transparency ramps from 0.0 (opaque) to 1.0 (transparent). As the transparency increases, an emissive textured inner box for the monolith becomes visible. The inner box's emissive shading makes it appear to be a light source, and the plausible source of the PointLight source's illumination. The overall effect is one of pulsing glowing monoliths. 
    #  A grid mesh floor is used so that localized lighting effects will be obvious. 
    #  Things to experiment with: 
    #  Try adding a ScalarInterpolator to each monolith and route it's output in to the rotation field of the monolith's TextureTransform. This will rotate the texture on the monolith. 
    #  Instead of the transparent box trick, try using a ColorInterpolator to gradually increase the emissiveColor of a single monolith box while decreasing the box's diffuseColor. 
    #  Try routing the TimeSensor's outputs in to a ScalarInterpolator that varies up and down smoothly, then route this output in to the light source's intensity, etc. Instead of the 0.1-1.0 ramp, then instant fall to 0.0 that the TimeSensor's fraction output gives, you can shape an arbitrary smooth rise and fall curve in the Scalar Interpolator's key values. 
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Monolith World'),
    Viewpoint(description='Monolith Entry View',position=(0.0,1.6,9.0)),
    NavigationInfo(headlight=False,type='"WALK" "ANY"'),
    Background(skyAngle=[1.37,1.57],skyColor=[(0.0,0.0,0.0),(0.0,0.0,0.0),(0.0,0.1,0.5)]),
    PointLight(ambientIntensity=0.1,color=(0.2,0.2,0.2),location=(0.0,8.0,10.0)),
    PointLight(DEF='Monolith1Light',ambientIntensity=0.2,color=(0.8,0.4,0.0),intensity=0.0,location=(0.0,2.0,0.5)),
    Transform(translation=(0.0,2.0,0.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(DEF='Monolith1Facade',diffuseColor=(0.2,0.2,0.2),transparency=1.0)),
        geometry=Box(DEF='MonolithOuterBox',size=(2.0,4.0,0.3))),
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(0.5,0.5)),
          texture=ImageTexture(DEF='MonolithInnerFire',url=["fire.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/fire.jpg"])),
        geometry=Box(DEF='MonolithInnerBox',size=(1.9,3.9,0.2))),
      TouchSensor(DEF='Monolith1Touch')]),
    PointLight(DEF='Monolith2Light',ambientIntensity=0.2,color=(0.8,0.4,0.0),intensity=0.0,location=(-3.0,2.0,2.5)),
    Transform(translation=(-3.0,2.0,2.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(DEF='Monolith2Facade',diffuseColor=(0.2,0.2,0.2),transparency=1.0)),
        geometry=Box(USE='MonolithOuterBox')),
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(0.3,0.3),translation=(0.2,0.2)),
          texture=ImageTexture(USE='MonolithInnerFire')),
        geometry=Box(USE='MonolithInnerBox')),
      TouchSensor(DEF='Monolith2Touch')]),
    PointLight(DEF='Monolith3Light',ambientIntensity=0.2,color=(0.8,0.4,0.0),intensity=0.0,location=(4.0,2.0,-1.5)),
    Transform(translation=(4.0,2.0,-2.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(DEF='Monolith3Facade',diffuseColor=(0.2,0.2,0.2),transparency=1.0)),
        geometry=Box(USE='MonolithOuterBox')),
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(0.1,0.1),translation=(0.3,0.5)),
          texture=ImageTexture(USE='MonolithInnerFire')),
        geometry=Box(USE='MonolithInnerBox')),
      TouchSensor(DEF='Monolith3Touch')]),
    PointLight(DEF='Monolith4Light',ambientIntensity=0.2,color=(0.8,0.4,0.0),intensity=0.0,location=(4.5,2.0,3.5)),
    Transform(translation=(4.5,2.0,3.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(DEF='Monolith4Facade',diffuseColor=(0.2,0.2,0.2),transparency=1.0)),
        geometry=Box(USE='MonolithOuterBox')),
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(0.2,0.2),translation=(0.4,0.6)),
          texture=ImageTexture(USE='MonolithInnerFire')),
        geometry=Box(USE='MonolithInnerBox')),
      TouchSensor(DEF='Monolith4Touch')]),
    PointLight(DEF='Monolith5Light',ambientIntensity=0.2,color=(0.8,0.4,0.0),intensity=0.0,location=(-3.5,2.0,-4.5)),
    Transform(translation=(-3.5,2.0,-5.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(DEF='Monolith5Facade',diffuseColor=(0.2,0.2,0.2),transparency=1.0)),
        geometry=Box(USE='MonolithOuterBox')),
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(0.2,0.4),translation=(0.5,0.1)),
          texture=ImageTexture(USE='MonolithInnerFire')),
        geometry=Box(USE='MonolithInnerBox')),
      TouchSensor(DEF='Monolith5Touch')]),
    PointLight(DEF='Monolith6Light',ambientIntensity=0.2,color=(0.8,0.4,0.0),intensity=0.0,location=(2.0,2.0,-5.5)),
    Transform(translation=(2.0,2.0,-6.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(DEF='Monolith6Facade',diffuseColor=(0.2,0.2,0.2),transparency=1.0)),
        geometry=Box(USE='MonolithOuterBox')),
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(0.2,0.4),translation=(0.5,0.1)),
          texture=ImageTexture(USE='MonolithInnerFire')),
        geometry=Box(USE='MonolithInnerBox')),
      TouchSensor(DEF='Monolith6Touch')]),
    Inline(url=["Floor.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Floor.x3d","Floor.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Floor.wrl"]),
    TimeSensor(DEF='Monolith1Timer',cycleInterval=4.0,stopTime=0.1),
    ROUTE(fromField='touchTime',fromNode='Monolith1Touch',toField='set_startTime',toNode='Monolith1Timer'),
    ROUTE(fromField='fraction_changed',fromNode='Monolith1Timer',toField='set_transparency',toNode='Monolith1Facade'),
    ROUTE(fromField='fraction_changed',fromNode='Monolith1Timer',toField='set_intensity',toNode='Monolith1Light'),
    TimeSensor(DEF='Monolith2Timer',cycleInterval=4.5,stopTime=0.1),
    ROUTE(fromField='touchTime',fromNode='Monolith2Touch',toField='set_startTime',toNode='Monolith2Timer'),
    ROUTE(fromField='fraction_changed',fromNode='Monolith2Timer',toField='set_transparency',toNode='Monolith2Facade'),
    ROUTE(fromField='fraction_changed',fromNode='Monolith2Timer',toField='set_intensity',toNode='Monolith2Light'),
    TimeSensor(DEF='Monolith3Timer',cycleInterval=5.0,stopTime=0.1),
    ROUTE(fromField='touchTime',fromNode='Monolith3Touch',toField='set_startTime',toNode='Monolith3Timer'),
    ROUTE(fromField='fraction_changed',fromNode='Monolith3Timer',toField='set_transparency',toNode='Monolith3Facade'),
    ROUTE(fromField='fraction_changed',fromNode='Monolith3Timer',toField='set_intensity',toNode='Monolith3Light'),
    TimeSensor(DEF='Monolith4Timer',cycleInterval=5.5,stopTime=0.1),
    ROUTE(fromField='touchTime',fromNode='Monolith4Touch',toField='set_startTime',toNode='Monolith4Timer'),
    ROUTE(fromField='fraction_changed',fromNode='Monolith4Timer',toField='set_transparency',toNode='Monolith4Facade'),
    ROUTE(fromField='fraction_changed',fromNode='Monolith4Timer',toField='set_intensity',toNode='Monolith4Light'),
    TimeSensor(DEF='Monolith5Timer',cycleInterval=6.0,stopTime=0.1),
    ROUTE(fromField='touchTime',fromNode='Monolith5Touch',toField='set_startTime',toNode='Monolith5Timer'),
    ROUTE(fromField='fraction_changed',fromNode='Monolith5Timer',toField='set_transparency',toNode='Monolith5Facade'),
    ROUTE(fromField='fraction_changed',fromNode='Monolith5Timer',toField='set_intensity',toNode='Monolith5Light'),
    TimeSensor(DEF='Monolith6Timer',cycleInterval=6.5,stopTime=0.1),
    ROUTE(fromField='touchTime',fromNode='Monolith6Touch',toField='set_startTime',toNode='Monolith6Timer'),
    ROUTE(fromField='fraction_changed',fromNode='Monolith6Timer',toField='set_transparency',toNode='Monolith6Facade'),
    ROUTE(fromField='fraction_changed',fromNode='Monolith6Timer',toField='set_intensity',toNode='Monolith6Light')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Monolith.py:')
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

print("python Monolith.py load and self-test diagnostics complete.")
