####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python StopWatch.py
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
    meta(content='StopWatch.x3d',name='title'),
    meta(content='Stop-watch with automatically moving second, minute, and hour hands, start and stop buttons, and a stop-watch sweep second hand.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='StopWatch.png',name='Image'),
    meta(content='originals/stopwtch.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0256.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/StopWatch.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Stop watch'),
    Viewpoint(description='Entry view',position=(0.0,0.0,15.0)),
    NavigationInfo(),
    Transform(DEF='StopWatch',
      children=[
      Transform(rotation=(1.0,0.0,0.0,1.571),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.7,0.3,0.0))),
          geometry=Cylinder(height=0.8,radius=4.8)),
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(1.0,1.0,1.0))),
          geometry=Cylinder(height=0.9,radius=4.0))]),
      Transform(rotation=(0.0,0.0,1.0,-0.71),translation=(3.5,3.5,0.0),
        children=[
        TouchSensor(DEF='Start'),
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.0,1.0,0.0))),
          geometry=Cylinder(height=0.3,radius=0.38))]),
      Transform(rotation=(0.0,0.0,1.0,0.71),translation=(-3.5,3.5,0.0),
        children=[
        TouchSensor(DEF='Stop'),
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(1.0,0.0,0.0))),
          geometry=Cylinder(height=0.3,radius=0.38))]),
      Transform(DEF='MinuteHand',center=(0.0,-1.5,0.6),translation=(0.0,1.5,0.6),
        children=[
        Shape(DEF='Arm',
          appearance=Appearance(DEF='Black',
            material=Material(diffuseColor=(0.2,0.2,0.2))),
          geometry=Cylinder(height=3.0,radius=0.17)),
        Transform(DEF='ArrowHead',translation=(0.0,1.9,0.0),
          children=[
          Shape(
            appearance=Appearance(USE='Black'),
            geometry=Cone(bottomRadius=0.4,height=0.8))])]),
      Transform(DEF='HourHand',center=(0.0,-1.5,0.6),scale=(1.0,0.7,1.0),translation=(0.0,1.5,0.6),
        children=[
        Shape(USE='Arm'),
        Transform(USE='ArrowHead')]),
      Transform(DEF='SecondHand',center=(0.0,-1.5,0.6),scale=(0.6,1.0,0.6),translation=(0.0,1.5,0.6),
        children=[
        Shape(USE='Arm'),
        Transform(USE='ArrowHead')]),
      Transform(DEF='SweepHand',center=(0.0,-1.9,0.6),scale=(0.6,1.0,0.6),translation=(0.0,1.9,0.6),
        children=[
        Shape(
          appearance=Appearance(DEF='Red',
            material=Material(diffuseColor=(1.0,0.0,0.0))),
          geometry=Cylinder(height=3.8,radius=0.17))])]),
    TimeSensor(DEF='SecondTimer',cycleInterval=60.0,loop=True,stopTime=-1.0),
    TimeSensor(DEF='MinuteTimer',cycleInterval=3600.0,loop=True,stopTime=-1.0),
    TimeSensor(DEF='HourTimer',cycleInterval=43200.0,loop=True,startTime=28800.0,stopTime=-1.0),
    OrientationInterpolator(DEF='SecondSpinner',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,-3.14),(0.0,0.0,1.0,-6.28)]),
    OrientationInterpolator(DEF='MinuteSpinner',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,-3.14),(0.0,0.0,1.0,-6.28)]),
    OrientationInterpolator(DEF='HourSpinner',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,-3.14),(0.0,0.0,1.0,-6.28)]),
    ROUTE(fromField='fraction_changed',fromNode='SecondTimer',toField='set_fraction',toNode='SecondSpinner'),
    ROUTE(fromField='fraction_changed',fromNode='MinuteTimer',toField='set_fraction',toNode='MinuteSpinner'),
    ROUTE(fromField='fraction_changed',fromNode='HourTimer',toField='set_fraction',toNode='HourSpinner'),
    ROUTE(fromField='value_changed',fromNode='SecondSpinner',toField='set_rotation',toNode='SecondHand'),
    ROUTE(fromField='value_changed',fromNode='MinuteSpinner',toField='set_rotation',toNode='MinuteHand'),
    ROUTE(fromField='value_changed',fromNode='HourSpinner',toField='set_rotation',toNode='HourHand'),
    TimeSensor(DEF='SweepTimer',cycleInterval=60.0,loop=True,stopTime=1.0),
    OrientationInterpolator(DEF='SweepSpinner',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,-3.14),(0.0,0.0,1.0,-6.28)]),
    ROUTE(fromField='touchTime',fromNode='Start',toField='set_startTime',toNode='SweepTimer'),
    ROUTE(fromField='touchTime',fromNode='Stop',toField='set_stopTime',toNode='SweepTimer'),
    ROUTE(fromField='fraction_changed',fromNode='SweepTimer',toField='set_fraction',toNode='SweepSpinner'),
    ROUTE(fromField='value_changed',fromNode='SweepSpinner',toField='set_rotation',toNode='SweepHand'),
    TimeSensor(DEF='QuarterHour',cycleInterval=900.0,loop=True,startTime=28800.0,stopTime=-1.0),
    TimeSensor(DEF='QuarterAnimation',cycleInterval=3.0,startTime=-1.0),
    OrientationInterpolator(DEF='QuarterSpinner',key=[0.0,0.5,1.0],keyValue=[(1.0,1.0,0.0,0.0),(1.0,1.0,0.0,-3.14),(1.0,1.0,0.0,-6.28)]),
    PositionInterpolator(DEF='QuarterSquisher',key=[0.0,0.25,0.5,0.75,1.0],keyValue=[(1.0,1.0,1.0),(0.1,3.0,1.2),(3.0,0.1,1.0),(0.3,2.0,1.2),(1.0,1.0,1.0)]),
    ROUTE(fromField='cycleTime',fromNode='QuarterHour',toField='set_startTime',toNode='QuarterAnimation'),
    ROUTE(fromField='fraction_changed',fromNode='QuarterAnimation',toField='set_fraction',toNode='QuarterSpinner'),
    ROUTE(fromField='fraction_changed',fromNode='QuarterAnimation',toField='set_fraction',toNode='QuarterSquisher'),
    ROUTE(fromField='value_changed',fromNode='QuarterSpinner',toField='set_rotation',toNode='StopWatch'),
    ROUTE(fromField='value_changed',fromNode='QuarterSquisher',toField='set_scale',toNode='StopWatch')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for StopWatch.py:')
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

print("python StopWatch.py load and self-test diagnostics complete.")
