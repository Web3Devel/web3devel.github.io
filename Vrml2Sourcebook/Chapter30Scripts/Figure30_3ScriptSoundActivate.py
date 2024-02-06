####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure30_3ScriptSoundActivate.py
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
    meta(content='Figure30_3ScriptSoundActivate.x3d',name='title'),
    meta(content='Figure 30.3, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch30/30fig03.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='29 October 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A pair of filter scripts used to create a toggle on-off switch.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/Figure30_3ScriptSoundActivate.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure30_3ScriptSoundActivate.x3d'),
    Viewpoint(description='toggle sound by clicking ball'),
    Viewpoint(description='move left spatialize right',position=(-5,0,10)),
    Viewpoint(description='move right spatialize left',position=(5,0,10)),
    Viewpoint(description='outside maximum attenuation ellipsoid',position=(0,0,30)),
    NavigationInfo(type='"NONE"'),
    #  Background nodes are usually best placed at the top of the scene since they have global effect and are bindable nodes. 
    Background(groundAngle=[1.309,1.570796],groundColor=[(0.1,0.1,0),(0.5,0.25,0.2),(0.6,0.6,0.2)],skyAngle=[1.309,1.571],skyColor=[(1,0,0),(1,0.4,0),(1,1,0)]),
    Group(
      children=[
      TouchSensor(DEF='Touch',description='touch to toggle audio'),
      Shape(
        geometry=Sphere(),
        appearance=Appearance(
          material=Material(diffuseColor=(1,0.3,0.3)))),
      Sound(maxBack=15,maxFront=15,minBack=5,minFront=5,
        source=AudioClip(DEF='Audio',description='willow1',loop=True,url=["../Chapter24Sound/willow1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter24Sound/willow1.wav"])),
      Script(DEF='ToggleScript',
        field=[
        field(accessType='inputOnly',name='toggle',type='SFBool'),
        field(accessType='initializeOnly',name='state',type='SFBool',value=True),
        field(accessType='outputOnly',name='stateTurnedTrue',type='SFBool'),
        field(accessType='outputOnly',name='stateTurnedFalse',type='SFBool')],

      sourceCode="""
ecmascript:

// setting the value of an eventOut variable also sends it as an event
// you can view the output of print statements in the VRML Console

function toggle ( value, ts ) {
  // only toggle on click (isActive true) not release (isActive false)
  if ( value == false ) return;
  if ( state == true )
  {
	state  = false;
	stateTurnedFalse = true;
	Browser.println ('ToggleScript.state = ' + state + ', stateTurnedFalse = ' + true);
  }
  else
  {
	state  = true;
	stateTurnedTrue = true;
	Browser.println ('ToggleScript.state = ' + state + ', stateTurnedTrue = ' + true);
  }
}
"""),
      Script(DEF='TimeFilter',
        field=[
        field(accessType='inputOnly',name='setStart',type='SFBool'),
        field(accessType='inputOnly',name='setStop',type='SFBool'),
        field(accessType='outputOnly',name='startEventTime',type='SFTime'),
        field(accessType='outputOnly',name='stopEventTime',type='SFTime')],

      sourceCode="""
ecmascript:

// setting the value of an eventOut variable also sends it as an event

function setStart ( value, timeStamp ) {
	startEventTime = timeStamp;
	Browser.println ('TimeFilter.setStart (' + value + '), startEventTime = ' + timeStamp);
	Browser.println (); // newline
}
function setStop  ( value, timeStamp ) {
	stopEventTime  = timeStamp;
	Browser.println ('TimeFilter.setStop  (' + value + '),  stopEventTime = ' + timeStamp);
	Browser.println (); // newline
}
"""),
      ROUTE(fromField='isActive',fromNode='Touch',toField='toggle',toNode='ToggleScript'),
      ROUTE(fromField='stateTurnedTrue',fromNode='ToggleScript',toField='setStart',toNode='TimeFilter'),
      ROUTE(fromField='stateTurnedFalse',fromNode='ToggleScript',toField='setStop',toNode='TimeFilter'),
      ROUTE(fromField='startEventTime',fromNode='TimeFilter',toField='set_startTime',toNode='Audio'),
      ROUTE(fromField='stopEventTime',fromNode='TimeFilter',toField='set_stopTime',toNode='Audio'),
      #  extra widget 
      Transform(translation=(0,2.5,0),
        #  Selectable Text design pattern has transparent Box and TouchSensor description as a tooltip 
        children=[
        Shape(
          geometry=Text(string=["toggle sound","by clicking ball"],
            fontStyle=FontStyle(family=["SANS"],justify=["MIDDLE","MIDDLE"],size=0.8,style_='BOLD')),
          appearance=Appearance(
            material=Material(diffuseColor=(0.9,0.9,0.9))))])]),
    #  Semitransparent sphere matching maxFront-MaxBack attenuation ellipsoid 
    Shape(
      appearance=Appearance(DEF='TransparentAppearance',
        material=Material(diffuseColor=(0.5,0,0),transparency=0.7)),
      geometry=Sphere(radius=15))])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure30_3ScriptSoundActivate.py:')
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

print("python Figure30_3ScriptSoundActivate.py load and self-test diagnostics complete.")
