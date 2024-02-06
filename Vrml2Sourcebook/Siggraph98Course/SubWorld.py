####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python SubWorld.py
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
    meta(content='SubWorld.x3d',name='title'),
    meta(content='Multiple sounds example: submarine world with sounds. This world illustrates the use of multiple sounds and their ellipsoids to arrange so that different sounds are heard at different points in the world.',name='description'),
    meta(content='John L. Moreland',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='11 October 2020',name='modified'),
    meta(content='originals/subworld.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0350.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/SubWorld.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1998, John L. Moreland"],title='Submarine world with sounds'),
    NavigationInfo(),
    Viewpoint(description='Above',orientation=(1.0,0.0,0.0,-0.7),position=(0.0,10.0,19.0)),
    Viewpoint(description='Surface',position=(0.0,0.0,20.0)),
    Viewpoint(description='Below',position=(0.0,-3.0,20.0)),
    Viewpoint(description='Middle',position=(0.0,-3.0,0.0)),
    Group(
      children=[
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(DEF='WaterTT',scale=(0.3,0.3)),
          material=Material(diffuseColor=(0.254,0.494,0.8965),emissiveColor=(0.254,0.494,0.8965),transparency=0.5),
          texture=ImageTexture(url=["water.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/water.jpg"])),
        geometry=IndexedFaceSet(coordIndex=[0,1,2,3,0],solid=False,
          coord=Coordinate(point=[(20.0,0.0,20.0),(20.0,0.0,-20.0),(-20.0,0.0,-20.0),(-20.0,0.0,20.0)]))),
      Transform(DEF='Sub',
        children=[
        Transform(translation=(10.0,-2.0,0.0),
          children=[
          Inline(url=["Sub.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Sub.x3d","Sub.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Sub.wrl"])])])]),
    Background(groundAngle=[1.309,1.570796],groundColor=[(0.0,0.3,0.7),(0.0,0.2,0.3),(0.0,0.0,0.3)],skyAngle=[1.309,1.571],skyColor=[(0.0,0.2,0.9),(0.0,0.3,0.8),(0.254,0.494,0.8965)]),
    TimeSensor(DEF='TS',cycleInterval=8.0,loop=True),
    OrientationInterpolator(DEF='OI',key=[0.0,0.5,1.0],keyValue=[(0.0,1.0,0.0,0.0),(0.0,1.0,0.0,3.14159),(0.0,1.0,0.0,6.283)]),
    ROUTE(fromField='fraction_changed',fromNode='TS',toField='set_fraction',toNode='OI'),
    ROUTE(fromField='value_changed',fromNode='OI',toField='set_rotation',toNode='Sub'),
    TimeSensor(DEF='TS2',cycleInterval=90.0,loop=True),
    OrientationInterpolator(DEF='OI2',key=[0.0,0.5,1.0],keyValue=[(0.0,1.0,0.0,0.0),(0.0,1.0,0.0,3.14159),(0.0,1.0,0.0,6.283)]),
    Script(DEF='Churn',
      field=[
      field(accessType='outputOnly',name='one_changed',type='SFFloat'),
      field(accessType='inputOnly',name='set_rotation',type='SFRotation')],

    sourceCode="""
ecmascript:
		function set_rotation( rot, et )
		{
			one_changed = rot[3];
		}
"""),
    ROUTE(fromField='fraction_changed',fromNode='TS2',toField='set_fraction',toNode='OI2'),
    ROUTE(fromField='value_changed',fromNode='OI2',toField='set_rotation',toNode='Churn'),
    ROUTE(fromField='one_changed',fromNode='Churn',toField='set_rotation',toNode='WaterTT'),
    Transform(scale=(40.0,9.0,40.0),translation=(0.0,8.0,0.0),
      children=[
      Sound(maxBack=1.0,maxFront=1.0,spatialize=False,
        source=AudioClip(loop=True,url=["air.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/air.wav"]))]),
    Transform(scale=(25.0,1.0,25.0),
      children=[
      Sound(maxBack=1.0,maxFront=1.0,spatialize=False,
        source=AudioClip(loop=True,url=["paddle.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/paddle.wav"]))]),
    Transform(scale=(40.0,9.0,40.0),translation=(0.0,-8.0,0.0),
      children=[
      Sound(maxBack=1.0,maxFront=1.0,spatialize=False,
        source=AudioClip(loop=True,url=["water.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/water.wav"]))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for SubWorld.py:')
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

print("python SubWorld.py load and self-test diagnostics complete.")
