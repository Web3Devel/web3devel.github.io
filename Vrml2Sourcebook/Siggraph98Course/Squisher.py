####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Squisher.py
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
    meta(content='Squisher.x3d',name='title'),
    meta(content='Squishy ball world illustrates the use of orientation, color, and position interpolators. The world contains left, center, and right balls. The left and right balls swing back and forth, pivoting about a common point above the center ball. Each time the left and right balls swing inward, striking the center ball, the center ball squishes and turns red.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/squisher.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0157.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Squisher.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  To make this effect, two orientation interpolators swing the left and right balls back and forth. A position interpolator's output is used as a scale value to squish the center ball. Finally, a color interpolator repeatedly turns the center ball red, then blue. 
    children=[
    WorldInfo(info=["Copyright (c) 1997, David R. Nadeau"],title='Squishy ball'),
    Viewpoint(DEF='Entry',description='Entry view',position=(0.0,1.6,10.0)),
    NavigationInfo(),
    Background(),
    Transform(center=(0.0,4.0,0.0),
      children=[
      Transform(DEF='Squishee',
        children=[
        Shape(
          appearance=Appearance(
            material=Material(DEF='Coloree')),
          geometry=Sphere(),)]),
      Transform(DEF='Stick',translation=(0.0,2.0,0.0),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(),),
          geometry=Cylinder(height=4.0,radius=0.1))])]),
    Transform(DEF='Swingee1',center=(0.0,4.0,0.0),
      children=[
      Shape(DEF='Ball',
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,0.5,1.0))),
        geometry=Sphere(),),
      Transform(USE='Stick')]),
    Transform(DEF='Swingee2',center=(0.0,4.0,0.0),
      children=[
      Shape(USE='Ball'),
      Transform(USE='Stick')]),
    TimeSensor(DEF='Clock',cycleInterval=2.0,loop=True,startTime=1.0),
    OrientationInterpolator(DEF='Swinger1',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,-0.5),(0.0,0.0,1.0,-0.2),(0.0,0.0,1.0,-0.5)]),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='Swinger1'),
    ROUTE(fromField='value_changed',fromNode='Swinger1',toField='set_rotation',toNode='Swingee1'),
    OrientationInterpolator(DEF='Swinger2',key=[0.0,0.5,1.0],keyValue=[(0.0,0.0,1.0,0.5),(0.0,0.0,1.0,0.2),(0.0,0.0,1.0,0.5)]),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='Swinger2'),
    ROUTE(fromField='value_changed',fromNode='Swinger2',toField='set_rotation',toNode='Swingee2'),
    PositionInterpolator(DEF='Squisher',key=[0.0,0.5,1.0],keyValue=[(1.0,1.0,1.0),(0.5,1.4,1.4),(1.0,1.0,1.0)]),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='Squisher'),
    ROUTE(fromField='value_changed',fromNode='Squisher',toField='set_scale',toNode='Squishee'),
    ColorInterpolator(DEF='Colorer',key=[0.0,0.5,1.0],keyValue=[(0.0,0.5,1.0),(1.0,0.0,0.0),(0.0,0.5,1.0)]),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='Colorer'),
    ROUTE(fromField='value_changed',fromNode='Colorer',toField='set_diffuseColor',toNode='Coloree')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Squisher.py:')
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

print("python Squisher.py load and self-test diagnostics complete.")
