####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure30_4ScriptSpiralingBallTrace.py
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
    meta(content='Figure30_4ScriptSpiralingBallTrace.x3d',name='title'),
    meta(content='Figure 30.4, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch30/30fig04.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='2 September 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A spiraling red sphere and a custom interpolation script.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/Figure30_4ScriptSpiralingBallTrace.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure30_4ScriptSpiralingBallTrace.x3d'),
    Viewpoint(description='spiraling ball',orientation=(1,0,0,-0.3),position=(0,3,8)),
    Viewpoint(description='view from above',orientation=(1,0,0,-1.57),position=(0,6,0)),
    Viewpoint(description='side view',orientation=(0,1,0,1.57),position=(6,1,0)),
    #  Background nodes are usually best placed at the top of the scene since they have global effect and are bindable nodes. 
    Background(groundAngle=[1.309,1.570796],groundColor=[(0,0.1,0.3),(0.3,0.3,0.6),(0.4,0.4,0.6)],skyAngle=[1.309,1.571],skyColor=[(1,0,0.8),(0.5,0,0.8),(0,0,0.8)]),
    Group(
      children=[
      Transform(translation=(0,-0.005,0),
        children=[
        Shape(
          geometry=Box(size=(2,0.01,4)),
          appearance=Appearance(
            material=Material(diffuseColor=(0.7,0.7,0.7))))]),
      Transform(translation=(0,1.1,0),
        children=[
        Transform(DEF='BallTransform',
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(1,0.3,0.3))),
            geometry=Sphere(radius=0.1))])]),
      TimeSensor(DEF='Clock',cycleInterval=10,loop=True),
      Script(DEF='Mover',
        field=[
        field(accessType='inputOnly',name='set_fraction',type='SFFloat'),
        field(accessType='outputOnly',name='value_changed',type='SFVec3f'),
        field(accessType='initializeOnly',name='radius',type='SFFloat',value=1),
        field(accessType='initializeOnly',name='turns',type='SFFloat',value=4)],

      sourceCode="""
ecmascript:

function set_fraction ( fraction, eventTime ) {
	value_changed[0] = radius * Math.sin( turns * fraction * 6.28 ); // x
	value_changed[1] = radius * Math.cos( turns * fraction * 6.28 ); // y
	value_changed[2] = turns * (fraction - 0.5);                     // z
}
"""),
      Script(DEF='Debug',
        field=[
        field(accessType='initializeOnly',name='label',type='SFString',value='fraction'),
        field(accessType='inputOnly',name='set_float',type='SFFloat'),
        field(accessType='outputOnly',name='string_changed',type='MFString')],

      sourceCode="""
ecmascript:

function initalize( )
{
	string_changed[0] = label + ':';
}
function set_float( value, timestamp )
{
	string_changed[0] = label + ': ' + Math.round (value * 100) / 100;
}
"""),
      Transform(translation=(0,0.5,0),
        children=[
        Billboard(axisOfRotation=(0,0,0),
          children=[
          Shape(
            geometry=Text(DEF='Message',
              fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.3)),
            appearance=Appearance(
              material=Material(diffuseColor=(0,0,0),emissiveColor=(0,1,1))))])]),
      Transform(rotation=(1,0,0,1.57079),translation=(0,1.1,0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.5,0,0),transparency=0.7)),
          geometry=Cylinder(height=4))])]),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='Mover'),
    ROUTE(fromField='value_changed',fromNode='Mover',toField='set_translation',toNode='BallTransform'),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_float',toNode='Debug'),
    ROUTE(fromField='string_changed',fromNode='Debug',toField='set_string',toNode='Message')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure30_4ScriptSpiralingBallTrace.py:')
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

print("python Figure30_4ScriptSpiralingBallTrace.py load and self-test diagnostics complete.")
