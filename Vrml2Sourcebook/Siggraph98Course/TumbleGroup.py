####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python TumbleGroup.py
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
    meta(content='TumbleGroup.x3d',name='title'),
    meta(content='Tumble group: this file contains a Prototype declaration to manage a group of shapes, tumbling them in X, Y, and Z directions.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Loader.x3d',name='reference'),
    meta(content='One.x3d',name='reference'),
    meta(content='Two.x3d',name='reference'),
    meta(content='Three.x3d',name='reference'),
    meta(content='Boxes.x3d',name='reference'),
    meta(content='originals/tumgrp.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0465.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0469.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/TumbleGroup.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='TumbleGroup.x3d'),
    ProtoDeclare(name='TumbleGroup',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='initializeOnly',name='xTumbleInterval',type='SFTime',value=3.0),
        field(accessType='initializeOnly',name='children',type='MFNode',
          #  ProtoInstance needs to initialize children with a fieldValue 
          ),
        field(accessType='initializeOnly',name='zTumbleInterval',type='SFTime',value=5.0),
        field(accessType='initializeOnly',name='translation',type='SFVec3f',value=(0.0,0.0,0.0)),
        field(accessType='initializeOnly',name='yTumbleInterval',type='SFTime',value=1.0)]),
      ProtoBody=ProtoBody(
        children=[
        Transform(DEF='XRot',
          children=[
          Transform(DEF='YRot',
            children=[
            Transform(DEF='ZRot',
              IS=IS(
                connect=[
                connect(nodeField='translation',protoField='translation'),
                connect(nodeField='children',protoField='children')]))])]),
        TimeSensor(DEF='XClock',loop=True,startTime=1.0,
          IS=IS(
            connect=[
            connect(nodeField='cycleInterval',protoField='xTumbleInterval')])),
        TimeSensor(DEF='YClock',loop=True,startTime=1.0,
          IS=IS(
            connect=[
            connect(nodeField='cycleInterval',protoField='yTumbleInterval')])),
        TimeSensor(DEF='ZClock',loop=True,startTime=1.0,
          IS=IS(
            connect=[
            connect(nodeField='cycleInterval',protoField='zTumbleInterval')])),
        OrientationInterpolator(DEF='XRotIt',key=[0.0,0.25,0.5,0.75,1.0],keyValue=[(1.0,0.0,0.0,0.0),(1.0,0.0,0.0,1.57),(1.0,0.0,0.0,3.14),(1.0,0.0,0.0,4.71),(1.0,0.0,0.0,6.28)]),
        OrientationInterpolator(DEF='YRotIt',key=[0.0,0.25,0.5,0.75,1.0],keyValue=[(0.0,1.0,0.0,0.0),(0.0,1.0,0.0,1.57),(0.0,1.0,0.0,3.14),(0.0,1.0,0.0,4.71),(0.0,1.0,0.0,6.28)]),
        OrientationInterpolator(DEF='ZRotIt',key=[0.0,0.25,0.5,0.75,1.0],keyValue=[(0.0,0.0,1.0,0.0),(0.0,0.0,1.0,1.57),(0.0,0.0,1.0,3.14),(0.0,0.0,1.0,4.71),(0.0,0.0,1.0,6.28)]),
        ROUTE(fromField='fraction_changed',fromNode='XClock',toField='set_fraction',toNode='XRotIt'),
        ROUTE(fromField='fraction_changed',fromNode='YClock',toField='set_fraction',toNode='YRotIt'),
        ROUTE(fromField='fraction_changed',fromNode='ZClock',toField='set_fraction',toNode='ZRotIt'),
        ROUTE(fromField='value_changed',fromNode='XRotIt',toField='set_rotation',toNode='XRot'),
        ROUTE(fromField='value_changed',fromNode='YRotIt',toField='set_rotation',toNode='YRot'),
        ROUTE(fromField='value_changed',fromNode='ZRotIt',toField='set_rotation',toNode='ZRot')])),
    #  Display scene instructions for viewing an example scene with a corresponding prototype instance 
    Background(skyColor=[(0,0.333333,0.66667)]),
    Anchor(description='select text to view parent scene',url=["Loader.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Loader.x3d","Loader.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Loader.wrl"],
      children=[
      Shape(
        geometry=Text(string=["The TumbleGroup.x3d scene holds","a prototype declaration","","Select this text to view example usage","in Loader.x3d scene"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],style_='BOLD')),
        appearance=Appearance(
          material=Material(diffuseColor=(1,0.9,0.4)))),
      #  Invisible box behind text makes selection easier 
      Shape(
        geometry=Box(size=(12,5,0.1)),
        appearance=Appearance(
          material=Material(transparency=1)))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for TumbleGroup.py:')
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

print("python TumbleGroup.py load and self-test diagnostics complete.")
