####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure30_2ScriptBackgroundSelect.py
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
    meta(content='Figure30_2ScriptBackgroundSelect.x3d',name='title'),
    meta(content='Figure 30.2, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch30/30fig02.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='2 September 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Click on a geometric Shape to change the scene Background. A Script node controls the state changes.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/Figure30_2ScriptBackgroundSelect.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure30_2ScriptBackgroundSelect.x3d'),
    Viewpoint(description='Background select',orientation=(1,0,0,-0.2),position=(0,2,10)),
    #  Background nodes are usually best placed at the top of the scene since they have global effect and are bindable nodes. 
    #  Bindable Backgrounds (cyan, red, blue) 
    Background(DEF='Default'),
    Background(DEF='BackgroundCyan-ish',groundAngle=[1.309,1.570796],groundColor=[(0.1,0.1,0),(0.4,0.25,0.2),(0.6,0.6,0.6)],skyAngle=[1.309,1.571],skyColor=[(0,0.2,0.7),(0.0,0.5,1),(1,1,1)]),
    Background(DEF='BackgroundReddish',groundAngle=[1.309,1.570796],groundColor=[(0.1,0.1,0),(0.5,0.25,0.2),(0.6,0.6,0.2)],skyAngle=[1.309,1.571],skyColor=[(1,0,0),(1,0.4,0),(1,1,0)]),
    Background(DEF='BackgroundBluish',groundAngle=[1.309,1.570796],groundColor=[(0,0,0.1),(0,0.1,0.3),(0.3,0.3,0.6)],skyAngle=[1.309,1.571],skyColor=[(1,0,0.8),(0.5,0,0.8),(0,0,0.8)]),
    Group(
      children=[
      Transform(translation=(-3,0,0),
        children=[
        Shape(
          geometry=Box(),
          appearance=Appearance(
            material=Material(diffuseColor=(0,0.5,0.8)))),
        TouchSensor(DEF='SensorButton1',description='Cyan background')]),
      Script(DEF='Filter1',
        field=[
        field(accessType='inputOnly',appinfo='filter input value',name='set_boolean',type='SFBool'),
        field(accessType='outputOnly',appinfo='activated provides a persistent binding value otherwise isActive events will toggle Background binding on/off.',name='activated',type='SFBool'),
        field(accessType='initializeOnly',appinfo='count is only used locally so it is declared as an interface for persistence',name='count',type='SFInt32',value=1)],

      sourceCode="""
ecmascript:

function initialize () {
  Browser.println (' '); // skip line
  Browser.println ('Click shapes to select a background...');
  Browser.println (' '); // skip line
}

// setting the value of an eventOut variable also sends it as an event

function set_boolean ( value, eventTime ) {
  // only trigger on true values so that Background stays bound
  if ( value == true ) {  
	activated = value;
	Browser.println ('Cyan background ' + count);
  }
  else count++;  // received isActive value = false
}
"""),
      ROUTE(fromField='isActive',fromNode='SensorButton1',toField='set_boolean',toNode='Filter1'),
      ROUTE(fromField='activated',fromNode='Filter1',toField='set_bind',toNode='BackgroundCyan-ish'),
      Group(
        children=[
        Shape(
          geometry=Sphere(),
          appearance=Appearance(
            material=Material(diffuseColor=(1,0.3,0.3)))),
        TouchSensor(DEF='SensorButton2',description='Red background')]),
      Script(DEF='Filter2',
        field=[
        field(accessType='inputOnly',appinfo='filter input value',name='set_boolean',type='SFBool'),
        field(accessType='outputOnly',appinfo='activated provides a persistent binding value otherwise isActive events will toggle Background binding on/off.',name='activated',type='SFBool'),
        field(accessType='initializeOnly',appinfo='count is only used locally so it is declared as an interface for persistence',name='count',type='SFInt32',value=1)],

      sourceCode="""
ecmascript:

// setting the value of an eventOut variable also sends it as an event

function set_boolean ( value, eventTime ) {
  // only trigger on true values so that Background stays bound
  if ( value == true ) {
	activated = value;
	Browser.println ('Red background ' + count);
  }
  else count++;  // received isActive value = false
}
"""),
      ROUTE(fromField='isActive',fromNode='SensorButton2',toField='set_boolean',toNode='Filter2'),
      ROUTE(fromField='activated',fromNode='Filter2',toField='set_bind',toNode='BackgroundReddish'),
      Transform(translation=(3,0,0),
        children=[
        Shape(
          geometry=Cone(),
          appearance=Appearance(
            material=Material(diffuseColor=(0.2,0.2,0.8)))),
        TouchSensor(DEF='SensorButton3',description='Blue background')]),
      Script(DEF='Filter3',
        field=[
        field(accessType='inputOnly',appinfo='filter input value',name='set_boolean',type='SFBool'),
        field(accessType='outputOnly',appinfo='activated provides a persistent binding value otherwise isActive events will toggle Background binding on/off.',name='activated',type='SFBool'),
        field(accessType='initializeOnly',appinfo='count is only used locally so it is declared as an interface for persistence',name='count',type='SFInt32',value=1)],

      sourceCode="""
ecmascript:

// setting the value of an eventOut variable also sends it as an event

function set_boolean ( value, eventTime ) {
  // only trigger on true values so that Background stays bound
  if ( value == true ) {
	activated = value;
	Browser.println ('Blue background ' + count);
  }
  else count++;  // received isActive value = false
}
"""),
      ROUTE(fromField='isActive',fromNode='SensorButton3',toField='set_boolean',toNode='Filter3'),
      ROUTE(fromField='activated',fromNode='Filter3',toField='set_bind',toNode='BackgroundBluish'),
      Transform(translation=(0,-3,0),
        children=[
        Shape(
          geometry=Text(string=["Click on a Shape to change a Background,","Open player console to see trace statements."],
            fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.6)),
          appearance=Appearance(
            material=Material(diffuseColor=(0.7,0.7,0.7))))])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure30_2ScriptBackgroundSelect.py:')
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

print("python Figure30_2ScriptBackgroundSelect.py load and self-test diagnostics complete.")
