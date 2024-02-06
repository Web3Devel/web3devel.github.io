####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Colors.py
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

newModel=X3D(profile='Interactive',version='3.3',
  head=head(
    children=[
    meta(content='Colors.x3d',name='title'),
    meta(content='This scene presents some colorful frames. See the source comments regarding animation details.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/colors.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0073.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0130.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0167.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Colors.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  Orientation interpolators slowly spin 9 frames, each with a slightly different speed. At first there is a clear structure, but as the animation evolves the structure dissolves in to chaos. If you wait long enough, they'll all get back in sync again... after about 560 years! 
    #  Things to experiment with: Try using other time keyValue for the rotation speed of the 9 squares. If the keyValue are multiples of a common factor, the squares will get in sync sooner than if they don't have a common factor. 
    children=[
    WorldInfo(info=["Copyright (c) 1996, David R. Nadeau"],title='Colors'),
    Viewpoint(DEF='Entry',description='Entry view',position=(0.0,0.0,3.0)),
    NavigationInfo(),
    Background(),
    Transform(DEF='Frame1',
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(1.0,0.0,0.0))),
        geometry=IndexedFaceSet(DEF='Frame',coordIndex=[0,1,6,7,-1,1,2,17,16,-1,2,3,4,5,-1,19,18,5,6,-1,11,10,13,12,-1,10,9,20,21,-1,9,8,15,14,-1,22,23,14,13,-1,3,11,12,4,-1,4,12,15,7,-1,8,0,7,15,-1,0,8,11,3,-1,16,17,21,20,-1,21,17,18,22,-1,19,23,22,18,-1,16,20,23,19,-1],
          coord=Coordinate(point=[(-1.0,-1.0,0.1),(-0.9,-1.0,0.1),(0.9,-1.0,0.1),(1.0,-1.0,0.1),(1.0,1.0,0.1),(0.9,1.0,0.1),(-0.9,1.0,0.1),(-1.0,1.0,0.1),(-1.0,-1.0,-0.1),(-0.9,-1.0,-0.1),(0.9,-1.0,-0.1),(1.0,-1.0,-0.1),(1.0,1.0,-0.1),(0.9,1.0,-0.1),(-0.9,1.0,-0.1),(-1.0,1.0,-0.1),(-0.9,-0.9,0.1),(0.9,-0.9,0.1),(0.9,0.9,0.1),(-0.9,0.9,0.1),(-0.9,-0.9,-0.1),(0.9,-0.9,-0.1),(0.9,0.9,-0.1),(-0.9,0.9,-0.1)])))]),
    Transform(DEF='Frame2',translation=(0.0,0.0,-0.4),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(1.0,0.5,0.0))),
        geometry=IndexedFaceSet(USE='Frame'))]),
    Transform(DEF='Frame3',translation=(0.0,0.0,-0.8),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(1.0,1.0,0.0))),
        geometry=IndexedFaceSet(USE='Frame'))]),
    Transform(DEF='Frame4',translation=(0.0,0.0,-1.2),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.5,1.0,0.0))),
        geometry=IndexedFaceSet(USE='Frame'))]),
    Transform(DEF='Frame5',translation=(0.0,0.0,-1.6),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,1.0,0.0))),
        geometry=IndexedFaceSet(USE='Frame'))]),
    Transform(DEF='Frame6',translation=(0.0,0.0,-2.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,1.0,0.5))),
        geometry=IndexedFaceSet(USE='Frame'))]),
    Transform(DEF='Frame7',translation=(0.0,0.0,-2.4),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,1.0,1.0))),
        geometry=IndexedFaceSet(USE='Frame'))]),
    Transform(DEF='Frame8',translation=(0.0,0.0,-2.8),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,0.5,1.0))),
        geometry=IndexedFaceSet(USE='Frame'))]),
    Transform(DEF='Frame9',translation=(0.0,0.0,-3.2),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,0.0,1.0))),
        geometry=IndexedFaceSet(USE='Frame'))]),
    TouchSensor(DEF='Touch'),
    TimeSensor(DEF='Timer1',cycleInterval=10.0,loop=True,startTime=-1.0),
    TimeSensor(DEF='Timer2',cycleInterval=11.0,loop=True,startTime=-1.0),
    TimeSensor(DEF='Timer3',cycleInterval=12.0,loop=True,startTime=-1.0),
    TimeSensor(DEF='Timer4',cycleInterval=13.0,loop=True,startTime=-1.0),
    TimeSensor(DEF='Timer5',cycleInterval=14.0,loop=True,startTime=-1.0),
    TimeSensor(DEF='Timer6',cycleInterval=15.0,loop=True,startTime=-1.0),
    TimeSensor(DEF='Timer7',cycleInterval=16.0,loop=True,startTime=-1.0),
    TimeSensor(DEF='Timer8',cycleInterval=17.0,loop=True,startTime=-1.0),
    TimeSensor(DEF='Timer9',cycleInterval=18.0,loop=True,startTime=-1.0),
    OrientationInterpolator(DEF='Rot1',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,3.14),(0.0,0.0,1.0,6.28)]),
    OrientationInterpolator(DEF='Rot2',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,3.14),(0.0,0.0,1.0,6.28)]),
    OrientationInterpolator(DEF='Rot3',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,3.14),(0.0,0.0,1.0,6.28)]),
    OrientationInterpolator(DEF='Rot4',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,3.14),(0.0,0.0,1.0,6.28)]),
    OrientationInterpolator(DEF='Rot5',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,3.14),(0.0,0.0,1.0,6.28)]),
    OrientationInterpolator(DEF='Rot6',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,3.14),(0.0,0.0,1.0,6.28)]),
    OrientationInterpolator(DEF='Rot7',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,3.14),(0.0,0.0,1.0,6.28)]),
    OrientationInterpolator(DEF='Rot8',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,3.14),(0.0,0.0,1.0,6.28)]),
    OrientationInterpolator(DEF='Rot9',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,3.14),(0.0,0.0,1.0,6.28)]),
    ROUTE(fromField='touchTime',fromNode='Touch',toField='set_startTime',toNode='Timer1'),
    ROUTE(fromField='touchTime',fromNode='Touch',toField='set_startTime',toNode='Timer2'),
    ROUTE(fromField='touchTime',fromNode='Touch',toField='set_startTime',toNode='Timer3'),
    ROUTE(fromField='touchTime',fromNode='Touch',toField='set_startTime',toNode='Timer4'),
    ROUTE(fromField='touchTime',fromNode='Touch',toField='set_startTime',toNode='Timer5'),
    ROUTE(fromField='touchTime',fromNode='Touch',toField='set_startTime',toNode='Timer6'),
    ROUTE(fromField='touchTime',fromNode='Touch',toField='set_startTime',toNode='Timer7'),
    ROUTE(fromField='touchTime',fromNode='Touch',toField='set_startTime',toNode='Timer8'),
    ROUTE(fromField='touchTime',fromNode='Touch',toField='set_startTime',toNode='Timer9'),
    ROUTE(fromField='fraction_changed',fromNode='Timer1',toField='set_fraction',toNode='Rot1'),
    ROUTE(fromField='fraction_changed',fromNode='Timer2',toField='set_fraction',toNode='Rot2'),
    ROUTE(fromField='fraction_changed',fromNode='Timer3',toField='set_fraction',toNode='Rot3'),
    ROUTE(fromField='fraction_changed',fromNode='Timer4',toField='set_fraction',toNode='Rot4'),
    ROUTE(fromField='fraction_changed',fromNode='Timer5',toField='set_fraction',toNode='Rot5'),
    ROUTE(fromField='fraction_changed',fromNode='Timer6',toField='set_fraction',toNode='Rot6'),
    ROUTE(fromField='fraction_changed',fromNode='Timer7',toField='set_fraction',toNode='Rot7'),
    ROUTE(fromField='fraction_changed',fromNode='Timer8',toField='set_fraction',toNode='Rot8'),
    ROUTE(fromField='fraction_changed',fromNode='Timer9',toField='set_fraction',toNode='Rot9'),
    ROUTE(fromField='value_changed',fromNode='Rot1',toField='set_rotation',toNode='Frame1'),
    ROUTE(fromField='value_changed',fromNode='Rot2',toField='set_rotation',toNode='Frame2'),
    ROUTE(fromField='value_changed',fromNode='Rot3',toField='set_rotation',toNode='Frame3'),
    ROUTE(fromField='value_changed',fromNode='Rot4',toField='set_rotation',toNode='Frame4'),
    ROUTE(fromField='value_changed',fromNode='Rot5',toField='set_rotation',toNode='Frame5'),
    ROUTE(fromField='value_changed',fromNode='Rot6',toField='set_rotation',toNode='Frame6'),
    ROUTE(fromField='value_changed',fromNode='Rot7',toField='set_rotation',toNode='Frame7'),
    ROUTE(fromField='value_changed',fromNode='Rot8',toField='set_rotation',toNode='Frame8'),
    ROUTE(fromField='value_changed',fromNode='Rot9',toField='set_rotation',toNode='Frame9')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Colors.py:')
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

print("python Colors.py load and self-test diagnostics complete.")
