####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Robots.py
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
    meta(content='Robots.x3d',name='title'),
    meta(content='Robot generator prototype to create multiple new nodes. For this example, we create a new "Robot" node type that has three fields, one each for setting the l color (robot body), its eye color, and its rod color (gadgets on the body). Those three fields are used within the body of the Prototype where the robot form is constructed. Each time a Prototype field (l, eye, and rod colors) is used within the Prototype body, use the "IS" syntax to say: "this field within the Prototype body IS equal to the argument in the Prototype interface."',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='RoboBill.x3d',name='reference'),
    meta(content='originals/robot.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0479.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Robots.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1998, David R. Nadeau"],title='Robot Generator'),
    Viewpoint(description='Entry view',orientation=(1.0,0.0,0.0,-0.34),position=(0.0,3.6,6.8)),
    NavigationInfo(),
    Background(skyAngle=[1.77,1.87,1.97],skyColor=[(0.0,0.0,0.0),(0.0,0.0,0.0),(0.4,0.0,0.0),(0.6,0.0,0.0)]),
    ProtoDeclare(name='Robot',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='initializeOnly',name='rodColor',type='SFColor',value=(1.0,1.0,0.0)),
        field(accessType='initializeOnly',name='eyeColor',type='SFColor',value=(0.6,0.0,0.0)),
        field(accessType='initializeOnly',name='lColor',type='SFColor',value=(0.6,0.6,0.8))]),
      ProtoBody=ProtoBody(
        children=[
        Group(
          children=[
          Shape(
            appearance=Appearance(DEF='RobotColor',
              material=Material(
                IS=IS(
                  connect=[
                  connect(nodeField='diffuseColor',protoField='lColor')]))),
            geometry=Sphere(radius=0.5)),
          Transform(DEF='Rod',rotation=(0.0,0.0,1.0,-0.785),translation=(0.4,0.6,0.0),
            children=[
            Shape(
              appearance=Appearance(DEF='RobotGlow',
                material=Material(diffuseColor=(0.0,0.0,0.0),
                  IS=IS(
                    connect=[
                    connect(nodeField='emissiveColor',protoField='rodColor')]))),
              geometry=Cylinder(height=0.65,radius=0.04))]),
          Transform(rotation=(0.0,1.0,0.0,1.57),
            children=[
            Transform(USE='Rod')]),
          Transform(rotation=(0.0,1.0,0.0,3.14),
            children=[
            Transform(USE='Rod')]),
          Transform(rotation=(0.0,1.0,0.0,-1.57),
            children=[
            Transform(USE='Rod')]),
          Transform(translation=(0.0,0.85,0.0),
            children=[
            Shape(
              appearance=Appearance(USE='RobotColor'),
              geometry=Cylinder(height=0.1,radius=0.8))]),
          Transform(translation=(0.0,0.95,0.0),
            children=[
            Shape(
              appearance=Appearance(USE='RobotColor'),
              geometry=Cylinder(height=0.1,radius=0.2))]),
          Billboard(
            children=[
            Transform(translation=(0.0,1.4,0.0),
              children=[
              Shape(
                appearance=Appearance(USE='RobotColor'),
                geometry=Sphere(radius=0.5)),
              Transform(translation=(0.0,0.25,0.35),
                children=[
                Shape(
                  appearance=Appearance(
                    material=Material(diffuseColor=(0.2,0.2,0.2))),
                  geometry=Box(size=(0.6,0.05,0.2)))]),
              Transform(translation=(0.1,0.15,0.38),
                children=[
                Shape(DEF='Eye',
                  appearance=Appearance(
                    material=Material(diffuseColor=(0.0,0.0,0.0),
                      IS=IS(
                        connect=[
                        connect(nodeField='emissiveColor',protoField='eyeColor')]))),
                  geometry=Sphere(radius=0.09))]),
              Transform(translation=(-0.1,0.15,0.38),
                children=[
                Shape(USE='Eye')]),
              Transform(translation=(0.85,0.1,0.0),
                children=[
                Transform(rotation=(0.0,0.0,1.0,1.57),translation=(-0.2,0.0,0.0),
                  children=[
                  Shape(DEF='AntenaeBar',
                    appearance=Appearance(USE='RobotColor'),
                    geometry=Cylinder(height=0.4,radius=0.04))]),
                Shape(
                  appearance=Appearance(USE='RobotColor'),
                  geometry=Sphere(radius=0.09)),
                Transform(translation=(0.0,0.58,0.0),
                  children=[
                  Shape(
                    appearance=Appearance(USE='RobotGlow'),
                    geometry=Cone(bottomRadius=0.02,height=1.0))])]),
              Transform(translation=(-0.85,0.1,0.0),
                children=[
                Transform(rotation=(0.0,0.0,1.0,-1.57),translation=(0.2,0.0,0.0),
                  children=[
                  Shape(USE='AntenaeBar')]),
                Transform(rotation=(0.0,0.0,1.0,0.785),
                  children=[
                  Shape(
                    appearance=Appearance(USE='RobotColor'),
                    geometry=Box(size=(0.2,0.2,0.2))),
                  Transform(translation=(0.0,0.58,0.0),
                    children=[
                    Shape(
                      appearance=Appearance(USE='RobotGlow'),
                      geometry=Box(size=(0.02,1.0,0.02)))]),
                  Transform(translation=(0.0,0.95,0.0),
                    children=[
                    Shape(
                      appearance=Appearance(USE='RobotGlow'),
                      geometry=Box(size=(0.2,0.02,0.02)))]),
                  Transform(translation=(0.0,0.85,0.0),
                    children=[
                    Shape(
                      appearance=Appearance(USE='RobotGlow'),
                      geometry=Box(size=(0.4,0.02,0.02)))])])])])])])])),
    ProtoInstance(name='Robot',
      fieldValue=[
      fieldValue(name='eyeColor',value=(1.0,0.0,0.0)),
      fieldValue(name='rodColor',value=(1.0,1.0,0.0)),
      fieldValue(name='lColor',value=(0.6,0.6,0.8))]),
    Transform(translation=(-2.0,0.0,0.0),
      children=[
      ProtoInstance(name='Robot',
        fieldValue=[
        fieldValue(name='eyeColor',value=(0.0,1.0,0.0)),
        fieldValue(name='rodColor',value=(1.0,0.5,0.0)),
        fieldValue(name='lColor',value=(0.6,0.5,0.3))])]),
    Transform(translation=(2.0,0.0,0.0),
      children=[
      ProtoInstance(name='Robot',
        fieldValue=[
        fieldValue(name='eyeColor',value=(0.0,0.8,1.0)),
        fieldValue(name='rodColor',value=(0.0,0.8,1.0)),
        fieldValue(name='lColor',value=(0.6,0.3,0.8))])]),
    Transform(translation=(4.5,0.0,-3.0),
      children=[
      ProtoInstance(name='Robot',
        fieldValue=[
        fieldValue(name='eyeColor',value=(0.0,0.0,0.0)),
        fieldValue(name='rodColor',value=(1.0,0.0,0.5)),
        fieldValue(name='lColor',value=(0.0,0.4,0.9))])]),
    Transform(translation=(1.5,0.0,-3.0),
      children=[
      ProtoInstance(name='Robot',
        fieldValue=[
        fieldValue(name='eyeColor',value=(0.0,1.0,0.0)),
        fieldValue(name='rodColor',value=(1.0,1.0,0.0)),
        fieldValue(name='lColor',value=(0.6,0.6,0.5))])]),
    Transform(translation=(-1.5,0.0,-3.0),
      children=[
      ProtoInstance(name='Robot',
        fieldValue=[
        fieldValue(name='eyeColor',value=(1.0,1.0,0.0)),
        fieldValue(name='rodColor',value=(1.0,0.0,1.0)),
        fieldValue(name='lColor',value=(1.0,0.5,0.5))])]),
    Transform(translation=(-4.5,0.0,-3.0),
      children=[
      ProtoInstance(name='Robot',
        fieldValue=[
        fieldValue(name='eyeColor',value=(1.0,0.0,0.0)),
        fieldValue(name='rodColor',value=(0.5,0.0,1.0)),
        fieldValue(name='lColor',value=(0.0,0.5,1.0))])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Robots.py:')
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

print("python Robots.py load and self-test diagnostics complete.")
