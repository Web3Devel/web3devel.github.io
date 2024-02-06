####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Keyboard.py
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
    meta(content='Keyboard.x3d',name='title'),
    meta(content='Synthesizer keyboard that creates a playable synthesizer keyboard. Each key on the keyboard has a sound and touch sensor associated with it. Touching a key triggers the touch sensor, which triggers the sound.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/keybd.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0345.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Keyboard.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  Things to experiment with... 
    #  Use a Script to trigger sounds on **Mouse button down** not up. Huh, you say? Well, a TouchSensor generates a touch time event on mouse down, not up. Since means that sounds triggered by a TouchSensor seem to happen late... they happen when you release the mouse button, not when you press it. But, a TouchSensor sends a TRUE on it's isActive output on mouse down. So, you could route that into a Script node and grab the associated time stamp, then send THAT out as an event to start the sound. This will remove the lag and make sounds more responsive. 
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Synthesizer keyboard'),
    Viewpoint(description='Entry view',orientation=(1.0,0.0,0.0,-0.785),position=(0.875,1.5,1.5)),
    NavigationInfo(headlight=False),
    DirectionalLight(direction=(1.0,-2.0,-0.5)),
    Transform(
      children=[
      Shape(DEF='WhiteKey',
        appearance=Appearance(
          material=Material(diffuseColor=(1.0,1.0,1.0))),
        geometry=Box(size=(0.23,0.1,1.5))),
      TouchSensor(DEF='C4'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchC4',url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    Transform(translation=(0.125,0.1,-0.375),
      children=[
      Shape(DEF='BlackKey',
        appearance=Appearance(
          material=Material(diffuseColor=(0.4,0.4,0.4))),
        geometry=Box(size=(0.2,0.1,0.75))),
      TouchSensor(DEF='Cs4'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchCs4',pitch=1.059,url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    Transform(translation=(0.25,0.0,0.0),
      children=[
      Shape(USE='WhiteKey'),
      TouchSensor(DEF='D4'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchD4',pitch=1.122,url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    Transform(translation=(0.375,0.1,-0.375),
      children=[
      Shape(USE='BlackKey'),
      TouchSensor(DEF='Ds4'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchDs4',pitch=1.189,url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    Transform(translation=(0.5,0.0,0.0),
      children=[
      Shape(USE='WhiteKey'),
      TouchSensor(DEF='E4'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchE4',pitch=1.26,url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    Transform(translation=(0.75,0.0,0.0),
      children=[
      Shape(USE='WhiteKey'),
      TouchSensor(DEF='F4'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchF4',pitch=1.335,url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    Transform(translation=(0.875,0.1,-0.375),
      children=[
      Shape(USE='BlackKey'),
      TouchSensor(DEF='Fs4'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchFs4',pitch=1.414,url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    Transform(translation=(1.0,0.0,0.0),
      children=[
      Shape(USE='WhiteKey'),
      TouchSensor(DEF='G4'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchG4',pitch=1.498,url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    Transform(translation=(1.125,0.1,-0.375),
      children=[
      Shape(USE='BlackKey'),
      TouchSensor(DEF='Gs4'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchGs4',pitch=1.587,url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    Transform(translation=(1.25,0.0,0.0),
      children=[
      Shape(USE='WhiteKey'),
      TouchSensor(DEF='A5'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchA5',pitch=1.682,url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    Transform(translation=(1.375,0.1,-0.375),
      children=[
      Shape(USE='BlackKey'),
      TouchSensor(DEF='As5'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchAs5',pitch=1.782,url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    Transform(translation=(1.5,0.0,0.0),
      children=[
      Shape(USE='WhiteKey'),
      TouchSensor(DEF='B5'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchB5',pitch=1.888,url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    Transform(translation=(1.75,0.0,0.0),
      children=[
      Shape(USE='WhiteKey'),
      TouchSensor(DEF='C5'),
      Sound(maxBack=100.0,maxFront=100.0,
        source=AudioClip(DEF='PitchC5',pitch=2.0,url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"]))]),
    ROUTE(fromField='touchTime',fromNode='C4',toField='set_startTime',toNode='PitchC4'),
    ROUTE(fromField='touchTime',fromNode='Cs4',toField='set_startTime',toNode='PitchCs4'),
    ROUTE(fromField='touchTime',fromNode='D4',toField='set_startTime',toNode='PitchD4'),
    ROUTE(fromField='touchTime',fromNode='Ds4',toField='set_startTime',toNode='PitchDs4'),
    ROUTE(fromField='touchTime',fromNode='E4',toField='set_startTime',toNode='PitchE4'),
    ROUTE(fromField='touchTime',fromNode='F4',toField='set_startTime',toNode='PitchF4'),
    ROUTE(fromField='touchTime',fromNode='Fs4',toField='set_startTime',toNode='PitchFs4'),
    ROUTE(fromField='touchTime',fromNode='G4',toField='set_startTime',toNode='PitchG4'),
    ROUTE(fromField='touchTime',fromNode='Gs4',toField='set_startTime',toNode='PitchGs4'),
    ROUTE(fromField='touchTime',fromNode='A5',toField='set_startTime',toNode='PitchA5'),
    ROUTE(fromField='touchTime',fromNode='As5',toField='set_startTime',toNode='PitchAs5'),
    ROUTE(fromField='touchTime',fromNode='B5',toField='set_startTime',toNode='PitchB5'),
    ROUTE(fromField='touchTime',fromNode='C5',toField='set_startTime',toNode='PitchC5')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Keyboard.py:')
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

print("python Keyboard.py load and self-test diagnostics complete.")
