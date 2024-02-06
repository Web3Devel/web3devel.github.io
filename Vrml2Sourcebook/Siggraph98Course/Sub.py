####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Sub.py
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
    meta(content='Sub.x3d',name='title'),
    meta(content='Geometry used in Sound test scene.',name='description'),
    meta(content='David R. Nadeau, John L. Moreland, Michael M. Heck',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/sub.wrl',name='reference'),
    meta(content='SubWorld.x3d',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0350.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Sub.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Sub.x3d'),
    NavigationInfo(),
    Group(
      children=[
      Transform(scale=(0.2,0.2,1.0),
        children=[
        Shape(
          appearance=Appearance(DEF='Yellow',
            material=Material(diffuseColor=(1.0,1.0,0.0))),
          geometry=Sphere(radius=5.0))]),
      Transform(scale=(0.3,1.0,1.0),translation=(0.0,1.3,0.0),
        children=[
        Shape(
          appearance=Appearance(USE='Yellow'),
          geometry=Cylinder(height=1.0))]),
      Transform(DEF='Periscope',translation=(0.0,1.7,0.0),
        children=[
        Shape(
          appearance=Appearance(USE='Yellow'),
          geometry=Extrusion(crossSection=[(0.1,-0.1),(-0.1,-0.1),(-0.1,0.1),(0.1,0.1),(0.1,-0.1)],spine=[(0.0,0.0,0.0),(0.0,0.6,0.0),(0.0,0.6,0.5)]))])]),
    Transform(scale=(1.0,0.5,1.0),
      children=[
      Sound(maxBack=30.0,maxFront=30.0,minBack=15.0,minFront=15.0,
        source=AudioClip(DEF='Ping',pitch=0.5,url=["ping.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/ping.wav"]))]),
    Transform(scale=(1.0,0.5,1.0),
      children=[
      Sound(maxBack=30.0,maxFront=30.0,minBack=15.0,minFront=15.0,
        source=AudioClip(loop=True,startTime=1.0,url=["prop.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/prop.wav"]))]),
    TimeSensor(DEF='Time',cycleInterval=4.0,loop=True),
    ROUTE(fromField='cycleTime',fromNode='Time',toField='set_startTime',toNode='Ping'),
    OrientationInterpolator(DEF='Nav',key=[0.0,0.5,1.0],keyValue=[(0.0,1.0,0.0,0.0),(0.0,1.0,0.0,3.14159),(0.0,1.0,0.0,6.283)]),
    ROUTE(fromField='fraction_changed',fromNode='Time',toField='set_fraction',toNode='Nav'),
    ROUTE(fromField='value_changed',fromNode='Nav',toField='set_rotation',toNode='Periscope')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Sub.py:')
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

print("python Sub.py load and self-test diagnostics complete.")
