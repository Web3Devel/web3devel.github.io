####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Loader.py
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
    meta(content='Loader.x3d',name='title'),
    meta(content='This example illustrates use of JavaScript to load a scene from a file through use of the Browser object. When a button is selected to provide a new url for a file to load, the Script adds the new world, waits for the load to complete, then adds the loaded Shape into a rendered group.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Loader.png',name='Image'),
    meta(content='Button.x3d',name='reference'),
    meta(content='originals/loader.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0469.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Loader.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1998, David R. Nadeau"],title='Load VRML using a script'),
    NavigationInfo(),
    Viewpoint(description='Entry view'),
    Background(skyAngle=[1.37,1.57,1.77],skyColor=[(0.0,0.0,0.0),(0.0,0.0,0.0),(0.0,0.8,0.2),(0.0,0.0,0.0)]),
    ExternProtoDeclare(name='Button',url=["Button.x3d#Button","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Button.x3d#Button","Button.wrl#Button","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Button.wrl#Button"],
      field=[
      field(accessType='inputOutput',name='url',type='MFString'),
      field(accessType='inputOutput',name='textureUrl',type='MFString'),
      field(accessType='outputOnly',name='url_changed',type='MFString'),
      field(accessType='initializeOnly',name='translation',type='SFVec3f')]),
    ProtoInstance(DEF='Button1',name='Button',
      fieldValue=[
      fieldValue(name='url',value=["One.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/One.x3d"]),
      fieldValue(name='textureUrl',value=["one.jpg"]),
      fieldValue(name='translation',value=(-4.0,2.0,0.0))]),
    ProtoInstance(DEF='Button2',name='Button',
      fieldValue=[
      fieldValue(name='url',value=["Two.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Two.x3d"]),
      fieldValue(name='textureUrl',value=["two.jpg"]),
      fieldValue(name='translation',value=(-4.0,0.0,0.0))]),
    ProtoInstance(DEF='Button3',name='Button',
      fieldValue=[
      fieldValue(name='url',value=["Three.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Three.x3d"]),
      fieldValue(name='textureUrl',value=["three.jpg"]),
      fieldValue(name='translation',value=(-4.0,-2.0,0.0))]),
    Transform(translation=(-4.0,-3.5,0.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(),),
        geometry=Text(DEF='Label',
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.75)))]),
    Transform(DEF='Loaded',translation=(1.0,0.0,0.0),
      #  load result goes here 
      ),
    Script(DEF='Loader',directOutput=True,
      field=[
      field(accessType='initializeOnly',name='lastUrl',type='MFString',value=[""]),
      field(accessType='inputOnly',name='loadUrl',type='MFString'),
      field(accessType='inputOnly',name='vrmlLoaded',type='MFNode'),
      field(accessType='outputOnly',name='node_changed',type='MFNode'),
      field(accessType='outputOnly',name='string_changed',type='MFString'),
      field(accessType='initializeOnly',name='myself',type='SFNode',
        children=[
        Script(USE='Loader')])],

    sourceCode="""
ecmascript:

function loadUrl( str, ts )
{
        lastUrl = str;
        Browser.createVrmlFromURL( str, myself, 'vrmlLoaded' );
        string_changed[0] = 'Loading...';
}
function vrmlLoaded( nd, ts )
{
        node_changed = nd;
        string_changed[0] = lastUrl[0];
}
"""),
    ROUTE(fromField='url_changed',fromNode='Button1',toField='loadUrl',toNode='Loader'),
    ROUTE(fromField='url_changed',fromNode='Button2',toField='loadUrl',toNode='Loader'),
    ROUTE(fromField='url_changed',fromNode='Button3',toField='loadUrl',toNode='Loader'),
    ROUTE(fromField='node_changed',fromNode='Loader',toField='set_children',toNode='Loaded'),
    ROUTE(fromField='string_changed',fromNode='Loader',toField='set_string',toNode='Label')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Loader.py:')
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

print("python Loader.py load and self-test diagnostics complete.")
