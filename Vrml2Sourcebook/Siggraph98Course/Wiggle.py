####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Wiggle.py
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

newModel=X3D(profile='Interchange',version='3.3',
  head=head(
    children=[
    meta(content='Wiggle.x3d',name='title'),
    meta(content='Wiggling cubes illustrate the use of CoordinateInterpolator nodes to vary the coordinates of shapes (in this case a set of IndexedFaceSet cubes).',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/wioggle.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0195.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Wiggle.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Wiggling boxes'),
    Viewpoint(description='Entry view'),
    NavigationInfo(),
    Shape(DEF='Wig',
      appearance=Appearance(
        material=Material(diffuseColor=(0.0,0.5,1.0))),
      geometry=IndexedFaceSet(coordIndex=[0,1,2,3,-1,4,5,1,0,-1,5,6,2,1,-1,6,7,3,2,-1,7,4,0,3,-1,7,6,5,4,-1],
        coord=Coordinate(DEF='Coordinates',point=[(-1.0,1.0,1.0),(1.0,1.0,1.0),(1.0,1.0,-1.0),(-1.0,1.0,-1.0),(-1.0,-1.0,1.0),(1.0,-1.0,1.0),(1.0,-1.0,-1.0),(-1.0,-1.0,-1.0)]))),
    Transform(rotation=(1.0,0.0,0.0,3.1415),translation=(-3.0,0.0,0.0),
      children=[
      Shape(USE='Wig')]),
    Transform(rotation=(1.0,0.0,0.0,3.1415),translation=(3.0,0.0,0.0),
      children=[
      Shape(USE='Wig')]),
    Transform(rotation=(1.0,0.0,0.0,3.1415),translation=(0.0,0.0,-3.0),
      children=[
      Shape(USE='Wig')]),
    Transform(translation=(-3.0,0.0,-3.0),
      children=[
      Shape(USE='Wig')]),
    Transform(translation=(3.0,0.0,-3.0),
      children=[
      Shape(USE='Wig')]),
    Transform(rotation=(1.0,0.0,0.0,3.1415),translation=(0.0,0.0,3.0),
      children=[
      Shape(USE='Wig')]),
    Transform(translation=(-3.0,0.0,3.0),
      children=[
      Shape(USE='Wig')]),
    Transform(translation=(3.0,0.0,3.0),
      children=[
      Shape(USE='Wig')]),
    TimeSensor(DEF='Clock',cycleInterval=2.0,loop=True,startTime=1.0),
    CoordinateInterpolator(DEF='Interpolator',key=[0.0,0.25,0.5,0.75,1.0],keyValue=[(-1.0,1.0,1.0),(1.0,1.0,1.0),(1.0,1.0,-1.0),(-1.0,1.0,-1.0),(-1.0,-1.0,1.0),(1.0,-1.0,1.0),(1.0,-1.0,-1.0),(-1.0,-1.0,-1.0),(-0.5,1.0,0.5),(0.5,1.0,0.5),(0.5,1.0,-0.5),(-0.5,1.0,-0.5),(-1.5,-1.0,1.5),(1.5,-1.0,1.5),(1.5,-1.0,-1.5),(-1.5,-1.0,-1.5),(-1.0,1.0,1.0),(1.0,1.0,1.0),(1.0,1.0,-1.0),(-1.0,1.0,-1.0),(-1.0,-1.0,1.0),(1.0,-1.0,1.0),(1.0,-1.0,-1.0),(-1.0,-1.0,-1.0),(-1.5,1.0,1.5),(1.5,1.0,1.5),(1.5,1.0,-1.5),(-1.5,1.0,-1.5),(-0.5,-1.0,0.5),(0.5,-1.0,0.5),(0.5,-1.0,-0.5),(-0.5,-1.0,-0.5),(-1.0,1.0,1.0),(1.0,1.0,1.0),(1.0,1.0,-1.0),(-1.0,1.0,-1.0),(-1.0,-1.0,1.0),(1.0,-1.0,1.0),(1.0,-1.0,-1.0),(-1.0,-1.0,-1.0)]),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='Interpolator'),
    ROUTE(fromField='value_changed',fromNode='Interpolator',toField='set_point',toNode='Coordinates')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Wiggle.py:')
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

print("python Wiggle.py load and self-test diagnostics complete.")
