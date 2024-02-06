####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Lamp2a.py
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
    meta(content='Lamp2a.x3d',name='title'),
    meta(content="Desk lamp with light toggle switch: this file builds a desk lamp that can be moved about. Dragging on the lamp base slides the lamp back and forth. Dragging on the lamp arms turns the lamp arm. Dragging on the lamp shade turns the lamp shade. Touching the lamp's light switch (on the top of the lamp shade) turns the lamp on and off.",name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='3 September 2023',name='modified'),
    meta(content='originals/lamp2a.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0430.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Lamp2a.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  To make the lamp go on and off, a TouchSensor is routed into a 'toggle' script that alternates between TRUE and FALSE outputs, sending TRUE on the first TRUE input, then FALSE on the next TRUE input. These TRUE/FALSE values are routed into a SpotLight node within the lamp, turning it on and off. 
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Desk lamp with light toggle switch'),
    Viewpoint(DEF='Entry',description='Entry view',position=(0.0,0.1,1.0)),
    NavigationInfo(headlight=False),
    Background(),
    DirectionalLight(direction=(0.0,-1.0,-1.0),intensity=0.3),
    Transform(translation=(-1.0,0.0,-1.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(),
          texture=ImageTexture(url=["wood.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/wood.jpg"])),
        geometry=ElevationGrid(creaseAngle=3.14,height=[0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],xDimension=10,xSpacing=0.25,zDimension=10,zSpacing=0.25))]),
    Transform(rotation=(1.0,0.0,0.0,1.571),translation=(0.0,0.01,0.0),
      children=[
      PlaneSensor(DEF='MoveLamp'),
      Transform(DEF='Lamp',rotation=(1.0,0.0,0.0,-1.571),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.5,0.5,0.5))),
          geometry=Cylinder(height=0.01,radius=0.1)),
        Group(
          children=[
          CylinderSensor(DEF='MoveFirstArm'),
          Transform(DEF='FirstArm',
            children=[
            Transform(center=(0.0,-0.15,0.0),rotation=(1.0,0.0,0.0,-0.7),translation=(0.0,0.15,0.0),
              children=[
              Shape(DEF='LampArm',
                appearance=Appearance(DEF='Red',
                  material=Material(diffuseColor=(1.0,0.2,0.2))),
                geometry=Cylinder(height=0.3,radius=0.01)),
              Group(
                children=[
                CylinderSensor(DEF='MoveSecondArm'),
                Transform(DEF='SecondArm',
                  children=[
                  Transform(center=(0.0,-0.15,0.0),rotation=(1.0,0.0,0.0,1.9),translation=(0.0,0.3,0.0),
                    children=[
                    Shape(USE='LampArm'),
                    Group(
                      children=[
                      SphereSensor(DEF='MoveLampShade',offset=(1.0,0.0,0.0,-1.25)),
                      Transform(DEF='LampShade',center=(0.0,0.075,0.0),rotation=(1.0,0.0,0.0,-1.25),translation=(0.0,0.075,0.0),
                        children=[
                        Shape(
                          appearance=Appearance(USE='Red'),
                          geometry=Cone(bottom=False,bottomRadius=0.12,height=0.15)),
                        Transform(translation=(0.0,0.075,0.0),
                          children=[
                          TouchSensor(DEF='LightSwitch'),
                          Shape(
                            appearance=Appearance(
                              material=Material(diffuseColor=(1.0,1.0,1.0))),
                            geometry=Cylinder(height=0.03,radius=0.007))]),
                        Transform(translation=(0.0,-0.05,0.0),
                          children=[
                          SpotLight(DEF='LampLight',ambientIntensity=0.2,beamWidth=0.6,direction=(0.0,-1.0,0.0)),
                          Shape(
                            appearance=Appearance(
                              material=Material(DEF='BulbMaterial',diffuseColor=(0.0,0.0,0.0),emissiveColor=(1.0,1.0,1.0))),
                            geometry=Sphere(radius=0.05))])])])])])])])])])])]),
    ROUTE(fromField='translation_changed',fromNode='MoveLamp',toField='set_translation',toNode='Lamp'),
    ROUTE(fromField='rotation_changed',fromNode='MoveFirstArm',toField='set_rotation',toNode='FirstArm'),
    ROUTE(fromField='rotation_changed',fromNode='MoveSecondArm',toField='set_rotation',toNode='SecondArm'),
    ROUTE(fromField='rotation_changed',fromNode='MoveLampShade',toField='set_rotation',toNode='LampShade'),
    Script(DEF='Toggle',
      field=[
      field(accessType='initializeOnly',name='on',type='SFBool',value=True),
      field(accessType='inputOnly',name='set_active',type='SFBool'),
      field(accessType='outputOnly',name='on_changed',type='SFBool')],

    sourceCode="""
ecmascript:
		function set_active( b, tm ) {
			// ignore button releases
			if ( b == false ) return;

			// toggle on button presses
			if ( on == true ) on = false;
			else              on = true;
			on_changed = on;
		}
"""),
    ROUTE(fromField='isActive',fromNode='LightSwitch',toField='set_active',toNode='Toggle'),
    ROUTE(fromField='on_changed',fromNode='Toggle',toField='set_on',toNode='LampLight')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Lamp2a.py:')
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

print("python Lamp2a.py load and self-test diagnostics complete.")
