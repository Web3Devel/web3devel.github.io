####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure30_1ScriptSlidingBall.py
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
    meta(content='Figure30_1ScriptSlidingBall.x3d',name='title'),
    meta(content='Figure 30.1, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch30/30fig01.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='28 November 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A sliding red sphere and a custom interpolation script. Three ways to include ECMAScript (JavaScript) programming are compared: external file, url script code, and embedded script code. Recommendation: use embedded script code inside a CDATA block.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/Figure30_1ScriptSlidingBall.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure30_1ScriptSlidingBall.x3d'),
    Viewpoint(description='sliding ball',orientation=(1,0,0,-0.2),position=(0.5,0.5,1.5)),
    #  Background nodes are usually best placed at the top of the scene since they have global effect and are bindable nodes. 
    Background(groundAngle=[1.309,1.570796],groundColor=[(0,0,0.1),(0,0.1,0.3),(0.3,0.3,0.6)],skyAngle=[1.309,1.571],skyColor=[(1,0,0.8),(0.5,0,0.8),(0,0,0.8)]),
    Group(
      children=[
      Transform(DEF='Floor',translation=(0.5,-0.005,0),
        children=[
        Shape(
          geometry=Box(size=(1,0.01,0.5)),
          appearance=Appearance(
            material=Material(diffuseColor=(0.7,0.7,0.7))))]),
      Transform(translation=(0,0.1,0),
        children=[
        Transform(DEF='BallTransform',
          children=[
          Shape(
            geometry=Sphere(radius=0.1),
            appearance=Appearance(
              material=Material(diffuseColor=(1,0.3,0.3))))])]),
      TimeSensor(DEF='Clock',cycleInterval=4,loop=True),
      #  In this example, each Script node can serve as a simple replacement for a PositionInterpolator node. 
      #  First Script example: external .js javascript file. This can be helpful if multiple Script nodes (perhaps in multiple scenes) reuse the same code, allowing any changes to occur in a single .js ecmascript file. 
      Script(DEF='MoverUsingExternalScriptFile',url=["Figure30_1ScriptSlidingBall.js","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/Figure30_1ScriptSlidingBall.js"],
        field=[
        field(accessType='inputOnly',name='set_fraction',type='SFFloat'),
        field(accessType='outputOnly',name='value_changed',type='SFVec3f')],

      sourceCode="""
ecmascript:

"""),
      #  Second Script example: executable code is placed in url field. This is legal, but no longer a recommended approach. 
      #  Warning: avoid // inline comments or else canonicalization will hide all follow-on code! 
      Script(DEF='MoverUsingUrlScript',url=["ecmascript: function set_fraction( fraction eventTime ) { value_changed[0] = fraction; value_changed[1] = 0.0; value_changed[2] = 0.0; }"],
        field=[
        field(accessType='inputOnly',name='set_fraction',type='SFFloat'),
        field(accessType='outputOnly',name='value_changed',type='SFVec3f')],

      sourceCode="""
ecmascript:

"""),
      #  Third Script example, using preferred method: script code contained in CDATA block 
      Script(DEF='MoverUsingContainedScript',
        field=[
        field(accessType='inputOnly',appinfo='receive fraction from clock',name='set_fraction',type='SFFloat'),
        field(accessType='outputOnly',appinfo='produce output position to move the ball',name='value_changed',type='SFVec3f')],

      sourceCode="""
ecmascript:

// Move a shape in a straight path
function set_fraction( fraction, eventTime ) {
	value_changed[0] = fraction;    // X component
	value_changed[1] = 0.0;         // Y component
	value_changed[2] = 0.0;         // Z component
}
""")]),
    #  Any one of the three Mover script alternatives can drive the ball - modify both ROUTEs to test 
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='MoverUsingContainedScript'),
    ROUTE(fromField='value_changed',fromNode='MoverUsingContainedScript',toField='set_translation',toNode='BallTransform')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure30_1ScriptSlidingBall.py:')
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

print("python Figure30_1ScriptSlidingBall.py load and self-test diagnostics complete.")
