####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure08_3PositionInterpolator.py
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

newModel=X3D(profile='Interchange',version='3.0',
  head=head(
    children=[
    meta(content='Figure08_3PositionInterpolator.x3d',name='title'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch08/08fig03.htm',name='reference'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='8 August 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Simple PositionInterpolator example. An animation that moves a coordinate system and the cube built within it along a bouncing path.',name='description'),
    meta(content='PositionInterpolatorPathMapDiagram.png',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter08AnimatingPositionOrientationScale/Figure08_3PositionInterpolator.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    Group(
      children=[
      WorldInfo(title='Figure08_3PositionInterpolator.x3d'),
      NavigationInfo(),
      #  Animation clock 
      TimeSensor(DEF='CLOCK',cycleInterval=4,loop=True),
      #  Key locations in the animation path are captured in the PositionInterpolator. 
      #  Intermediate position values are interpolated between key locations. 
      PositionInterpolator(DEF='CUBEPATH',key=[0.00,0.11,0.17,0.22,0.33,0.44,0.50,0.55,0.66,0.77,0.83,0.88,0.99],keyValue=[(0.0,0.0,0.0),(1.0,1.96,1.0),(1.5,2.21,1.5),(2.0,1.96,2.0),(3.0,0.0,3.0),(2.0,1.96,3.0),(1.5,2.21,3.0),(1.0,1.96,3.0),(0.0,0.0,3.0),(0.0,1.96,2.0),(0.0,2.21,1.5),(0.0,1.96,1.0),(0.0,0.0,0.0)]),
      ROUTE(fromField='fraction_changed',fromNode='CLOCK',toField='set_fraction',toNode='CUBEPATH'),
      #  Moving box is rotated slightly to better show its shape. 
      Transform(DEF='BOUNCINGBOXTRANSFORM',rotation=(0,1,0,.78),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(.8,.8,.2))),
          geometry=Box(size=(1,1.5,1)))]),
      ROUTE(fromField='value_changed',fromNode='CUBEPATH',toField='set_translation',toNode='BOUNCINGBOXTRANSFORM')])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure08_3PositionInterpolator.py:')
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

print("python Figure08_3PositionInterpolator.py load and self-test diagnostics complete.")
