####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure09_8ClickDragTouchSensorPlaneSensorWithAxes.py
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

newModel=X3D(profile='Immersive',version='3.0',
  head=head(
    children=[
    meta(content='Figure09_8ClickDragTouchSensorPlaneSensorWithAxes.x3d',name='title'),
    meta(content='Figure 9.8, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch09/09fig08.htm',name='reference'),
    meta(content='Don Brutzman',name='transcriber'),
    meta(content='12 August 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A cube that spins when the cursor moves over it and translates when the cursor drags it, with coordinate axes superimposed to show X3D/VRML directions.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter09SensingViewer/Figure09_8ClickDragTouchSensorPlaneSensorWithAxes.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    #  Click and drag to spin and move shapes. Superfluous Group nodes removed. 
    children=[
    WorldInfo(title='Figure09_8ClickDragTouchSensorPlaneSensorWithAxes.x3d'),
    Group(
      children=[
      Transform(DEF='ROTATING_SHAPE_TRANSFORM',
        children=[
        Shape(
          geometry=Box(size=(1.414,1.414,1.414)),
          appearance=Appearance(
            material=Material(diffuseColor=(.1,.9,.9),emissiveColor=(.05,.2,.2))))]),
      TouchSensor(DEF='IS_OVER_SENSOR',description='Touch to spin'),
      PlaneSensor(DEF='DRAG_SENSOR',description='Click to drag in plane',maxPosition=(4,4),minPosition=(-4,-4)),
      TimeSensor(DEF='CLOCK',cycleInterval=4,enabled=False,loop=True),
      OrientationInterpolator(DEF='SPIN_PATH',key=[0,0.5,1],keyValue=[(0,1,0,0),(0,1,0,3.14),(0,1,0,6.28)])]),
    #  A small transparent box is added to indicate the virtual geometry of the PlaneSensor 
    Transform(DEF='TRANSPARENT_BOX_TRANSFORM',
      children=[
      Shape(
        geometry=Box(size=(8,8,0.1)),
        appearance=Appearance(
          material=Material(diffuseColor=(.7,.7,.7),transparency=.5)))]),
    #  Adding this Inline reference to another scene superimposes X3D/VRML coordinate system axes. 
    Transform(scale=(4,4,4),
      children=[
      Inline(DEF='CoordinateAxes',url=["../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d","../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.wrl"])]),
    #  Note that we are connecting a chain of behavior engines in these ROUTEs. The event types passed via each ROUTE must each match. 
    ROUTE(fromField='isOver',fromNode='IS_OVER_SENSOR',toField='set_enabled',toNode='CLOCK'),
    ROUTE(fromField='fraction_changed',fromNode='CLOCK',toField='set_fraction',toNode='SPIN_PATH'),
    ROUTE(fromField='value_changed',fromNode='SPIN_PATH',toField='set_rotation',toNode='ROTATING_SHAPE_TRANSFORM'),
    ROUTE(fromField='translation_changed',fromNode='DRAG_SENSOR',toField='set_translation',toNode='ROTATING_SHAPE_TRANSFORM')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure09_8ClickDragTouchSensorPlaneSensorWithAxes.py:')
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

print("python Figure09_8ClickDragTouchSensorPlaneSensorWithAxes.py load and self-test diagnostics complete.")