####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Button.py
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
    meta(content='Button.x3d',name='title'),
    meta(content='Simple button: this file contains a Prototype declaration to manage a button that, when clicked, rotates 90 degrees and sends a URL. This button is used in "loader.wrl".',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Loader.x3d',name='reference'),
    meta(content='originals/button.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0469.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Button.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1998, David R. Nadeau"],title='Simple Button'),
    ProtoDeclare(name='Button',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='inputOutput',name='url',type='MFString',value=[""]),
        field(accessType='inputOutput',name='textureUrl',type='MFString',value=[""]),
        field(accessType='outputOnly',name='url_changed',type='MFString'),
        field(accessType='initializeOnly',name='translation',type='SFVec3f',value=(0.0,0.0,0.0))]),
      ProtoBody=ProtoBody(
        children=[
        Transform(DEF='Trans',
          IS=IS(
            connect=[
            connect(nodeField='translation',protoField='translation')]),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(diffuseColor=(1.0,1.0,1.0)),
              texture=ImageTexture(
                IS=IS(
                  connect=[
                  connect(nodeField='url',protoField='textureUrl')]))),
            geometry=Box(size=(1.0,1.0,1.0))),
          TouchSensor(DEF='Touch',description='Select to initiate button spin and scene loading')]),
        TimeSensor(DEF='Timer',stopTime=1.0),
        OrientationInterpolator(DEF='Rotator',key=[0.0,1.0],keyValue=[(0.0,1.0,0.0,0.0),(0.0,1.0,0.0,1.571)]),
        Script(DEF='SendUrl',
          field=[
          field(accessType='initializeOnly',name='sendUrl',type='MFString'),
          field(accessType='inputOnly',name='set_touchTime',type='SFTime'),
          field(accessType='outputOnly',name='url_changed',type='MFString')],
          IS=IS(
            connect=[
            connect(nodeField='sendUrl',protoField='url'),
            connect(nodeField='url_changed',protoField='url_changed')]),

        sourceCode="""
ecmascript:
	function set_touchTime( tm, ts ) {
		url_changed = sendUrl;
	}
"""),
        ROUTE(fromField='touchTime',fromNode='Touch',toField='set_startTime',toNode='Timer'),
        ROUTE(fromField='fraction_changed',fromNode='Timer',toField='set_fraction',toNode='Rotator'),
        ROUTE(fromField='value_changed',fromNode='Rotator',toField='set_rotation',toNode='Trans'),
        ROUTE(fromField='touchTime',fromNode='Touch',toField='set_touchTime',toNode='SendUrl')])),
    #  Display scene instructions for viewing an example scene with a corresponding prototype instance 
    Background(skyColor=[(0,0.333333,0.66667)]),
    Anchor(description='select text to view parent scene',url=["Loader.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Loader.x3d","Loader.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Loader.wrl"],
      children=[
      Shape(
        geometry=Text(string=["Button.x3d scene holds","a prototype declaration","","Select this text to view example","use in Loader.x3d scene"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],style_='BOLD')),
        appearance=Appearance(
          material=Material(diffuseColor=(1,0.9,0.4)))),
      #  Selectable text: invisible box behind text makes selection easier 
      Shape(
        geometry=Box(size=(12,5,0.1)),
        appearance=Appearance(
          material=Material(transparency=1)))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Button.py:')
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

print("python Button.py load and self-test diagnostics complete.")
