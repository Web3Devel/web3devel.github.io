####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure24_3TouchSensorTriggeredSound.py
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
    meta(content='Figure24_3TouchSensorTriggeredSound.x3d',name='title'),
    meta(content='Figure 24.3, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch24/24fig03.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='24 September 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A world with sound triggered by touching a white ball, with an emitter marker marking the range of audible sound.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter24Sound/Figure24_3TouchSensorTriggeredSound.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure24_3TouchSensorTriggeredSound.x3d'),
    Viewpoint(description='click white ball for tone, markers indicate min/max range of sound',position=(0,1,20)),
    Viewpoint(description='20m distance, audible range circles at 5m and 10m',position=(0,1,20)),
    NavigationInfo(type='"WALK" "EXAMINE" "ANY"'),
    Group(
      children=[
      Sound(minBack=5,minFront=5,
        source=AudioClip(DEF='Source',description='tone1',url=["tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter24Sound/tone1.wav"])),
      Inline(url=["Figure24_1EmitterMarkers.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter24Sound/Figure24_1EmitterMarkers.x3d","Figure24_1EmitterMarkers.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter24Sound/Figure24_1EmitterMarkers.wrl"]),
      TouchSensor(DEF='Touch',description='touch to start')]),
    ROUTE(fromField='touchTime',fromNode='Touch',toField='set_startTime',toNode='Source')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure24_3TouchSensorTriggeredSound.py:')
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

print("python Figure24_3TouchSensorTriggeredSound.py load and self-test diagnostics complete.")
