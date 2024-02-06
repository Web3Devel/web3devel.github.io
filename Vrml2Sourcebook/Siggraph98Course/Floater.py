####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Floater.py
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
    meta(content='Floater.x3d',name='title'),
    meta(content='Floating pads world: a collection of white pads are created. Each pad slides back and forth horizontally or vertically at its own speed. A green light illuminates the tops of the pads while a blue light illuminates the bottoms.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Floater.png',name='Image'),
    meta(content='originals/floater.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0008.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0135htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Floater.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  Complexity is created from simplicity via two tricks: 
    #  1. Create a set of simple shapes, then repeat the same shapes several times. In this case, there are only 7 original pads moving left and right. Those 7 are repeated again, but turned around the Y axis so that they slide front to back. The same 7 are repeated again, but rotated around the Z axis so that they slide up and down. The effect is one of a complex bunch of moving shapes when in reality there are only 7. 
    #  2. Give each moving shape a slightly different cycle interval for its animation. This makes all the movement out of sync, which again creates the appearance of complexity. 
    #  A PROTO is used to create a new Pad node that incorporates a box shape, a time sensor, a position interpolator, and routes to connect them together. Fields to the Pad node control the initial placement of the pad, and it's animation cycle interval. 
    #  Add textures. Particularly try adding a texture with a transparency (alpha) channel. Using transparency textures you can add stripes, checks, or whatever to the pads. One approach that looks interesting is to add a cloud texture, but make the sky behind the clouds transparent in the texture. When mapped, this creates a blobby indistinct shape on each pad. 
    #  Add a Transform node around the entire group of pads, then use an OrientationInterpolator and TimeSensor to slowly spin the world. Remembering the complexity tricks above, you can create a complex tumble by using three nested Transform nodes (X, Y, and Z), each with its own OrientationInterpolator and TimeSensor. Give the three TimeSensors slightly different cycleInterval values (such as 5.0, 7.0, and 11.0). Prime numbers are good choices. Since the cycle times are different for the three spins, they don't sync up, and it looks like a chaotic tumble. 
    children=[
    WorldInfo(info=["Copyright (c) 1996, David R. Nadeau"],title='Floating Pads World'),
    Viewpoint(description='Entry view',position=(0.0,1.6,10.0)),
    NavigationInfo(headlight=False),
    Background(skyColor=[(0.0,0.1,0.4)]),
    DirectionalLight(color=(0.3,1.0,0.3),direction=(0.5,-1.0,-0.7)),
    DirectionalLight(color=(0.0,0.3,1.0),direction=(-0.5,1.0,0.7)),
    ProtoDeclare(name='Pad',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='inputOutput',name='rotation',type='SFRotation',value=(0.0,0.0,1.0,0.0)),
        field(accessType='inputOutput',name='cycleInterval',type='SFTime',value=10.0),
        field(accessType='inputOutput',name='translation',type='SFVec3f',value=(0.0,0.0,0.0))]),
      ProtoBody=ProtoBody(
        children=[
        Collision(enabled=False,
          children=[
          Transform(
            IS=IS(
              connect=[
              connect(nodeField='translation',protoField='translation'),
              connect(nodeField='rotation',protoField='rotation')]),
            children=[
            Transform(DEF='Movee',
              children=[
              Shape(
                appearance=Appearance(
                  material=Material(diffuseColor=(1.0,1.0,1.0))),
                geometry=Box(size=(4.0,0.2,2.0))),
              TimeSensor(DEF='Clock',loop=True,startTime=1.0,
                IS=IS(
                  connect=[
                  connect(nodeField='cycleInterval',protoField='cycleInterval')])),
              PositionInterpolator(DEF='Mover',key=[0.0,0.5,1.0],keyValue=[(-10.0,0.0,0.0),(10.0,0.0,0.0),(-10.0,0.0,0.0)])])])]),
        ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='Mover'),
        ROUTE(fromField='value_changed',fromNode='Mover',toField='set_translation',toNode='Movee')])),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='cycleInterval',value=10.0),
      fieldValue(name='translation',value=(0.0,4.0,0.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='cycleInterval',value=12.0),
      fieldValue(name='translation',value=(-2.0,0.0,-2.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='cycleInterval',value=14.0),
      fieldValue(name='translation',value=(2.0,6.0,-4.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='cycleInterval',value=16.0),
      fieldValue(name='translation',value=(-4.0,2.0,-8.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='cycleInterval',value=18.0),
      fieldValue(name='translation',value=(0.0,-6.0,-10.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='cycleInterval',value=10.0),
      fieldValue(name='translation',value=(4.0,-2.0,-10.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='cycleInterval',value=8.0),
      fieldValue(name='translation',value=(0.0,-4.0,-0.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,1.0,0.0,1.571)),
      fieldValue(name='cycleInterval',value=10.0),
      fieldValue(name='translation',value=(0.0,4.0,0.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,1.0,0.0,1.571)),
      fieldValue(name='cycleInterval',value=12.0),
      fieldValue(name='translation',value=(-2.0,0.0,-2.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,1.0,0.0,1.571)),
      fieldValue(name='cycleInterval',value=14.0),
      fieldValue(name='translation',value=(2.0,6.0,-4.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,1.0,0.0,1.571)),
      fieldValue(name='cycleInterval',value=16.0),
      fieldValue(name='translation',value=(-4.0,2.0,-8.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,1.0,0.0,1.571)),
      fieldValue(name='cycleInterval',value=18.0),
      fieldValue(name='translation',value=(0.0,-6.0,-10.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,1.0,0.0,1.571)),
      fieldValue(name='cycleInterval',value=10.0),
      fieldValue(name='translation',value=(4.0,-2.0,-10.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,1.0,0.0,1.571)),
      fieldValue(name='cycleInterval',value=8.0),
      fieldValue(name='translation',value=(0.0,-4.0,-0.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,0.0,1.0,1.571)),
      fieldValue(name='cycleInterval',value=10.0),
      fieldValue(name='translation',value=(0.0,4.0,0.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,0.0,1.0,1.571)),
      fieldValue(name='cycleInterval',value=12.0),
      fieldValue(name='translation',value=(-2.0,0.0,-2.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,0.0,1.0,1.571)),
      fieldValue(name='cycleInterval',value=14.0),
      fieldValue(name='translation',value=(2.0,6.0,-4.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,0.0,1.0,1.571)),
      fieldValue(name='cycleInterval',value=16.0),
      fieldValue(name='translation',value=(-4.0,2.0,-8.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,0.0,1.0,1.571)),
      fieldValue(name='cycleInterval',value=18.0),
      fieldValue(name='translation',value=(0.0,-6.0,-10.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,0.0,1.0,1.571)),
      fieldValue(name='cycleInterval',value=10.0),
      fieldValue(name='translation',value=(4.0,-2.0,-10.0))]),
    ProtoInstance(name='Pad',
      fieldValue=[
      fieldValue(name='rotation',value=(0.0,0.0,1.0,1.571)),
      fieldValue(name='cycleInterval',value=8.0),
      fieldValue(name='translation',value=(0.0,-4.0,-0.0))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Floater.py:')
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

print("python Floater.py load and self-test diagnostics complete.")
