####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure16_3ColoredLinesStarburst.py
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
    meta(content='Figure16_3ColoredLinesStarburst.x3d',name='title'),
    meta(content='Figure 16.3, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch16/16fig03.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='25 August 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='A star burst of lines colored using colors from a Color node, select second viewpoint for animation.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter16Color/Figure16_3ColoredLinesStarburst.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure16_3ColoredLinesStarburst.x3d'),
    Viewpoint(description='Starburst lines',position=(0,0,4)),
    Transform(DEF='SPINNING_VIEWPOINT_PARENT_TRANSFORM',
      children=[
      Viewpoint(description='Spinning viewpoint',position=(0,0,4))]),
    Group(
      children=[
      Shape(DEF='Burst',
        #  no Appearance nodee, use emissive coloring of Color node colors instead 
        #  note that original VRML Sourcebook example used 0 instead of -1 values for colorIndex sentinels 
        geometry=IndexedLineSet(colorIndex=[0,1,-1,0,1,-1,0,1,-1,0,1,-1,0,1,-1,0,1,-1,0,1,-1,0,1,-1,0,1,-1,0,1,-1,0,1,-1,0,1,-1,0,1,-1,0,1,-1,0,1,-1,0,1,-1],coordIndex=[0,1,-1,0,2,-1,0,3,-1,0,4,-1,0,5,-1,0,6,-1,0,7,-1,0,8,-1,0,9,-1,0,10,-1,0,11,-1,0,12,-1,0,13,-1,0,14,-1,0,15,-1,0,16,-1],
          coord=Coordinate(point=[(0.00,0.00,0.00),(1.00,0.00,0.00),(0.92,0.38,0.00),(0.71,0.71,0.00),(0.38,0.92,0.00),(0.00,1.00,0.00),(-0.38,0.92,0.00),(-0.71,0.71,0.00),(-0.92,0.38,0.00),(-1.00,0.00,0.00),(-0.92,-0.38,0.00),(-0.71,-0.71,0.00),(-0.38,-0.92,0.00),(0.00,-1.00,0.00),(0.38,-0.92,0.00),(0.71,-0.71,0.00),(0.92,-0.38,0.00)]),
          color=Color(color=[(1,1,0),(1,0.3,0.3)]))),
      Transform(rotation=(0,1,0,0.785),
        children=[
        Shape(USE='Burst')]),
      Transform(rotation=(0,1,0,1.571),
        children=[
        Shape(USE='Burst')]),
      Transform(rotation=(0,1,0,2.355),
        children=[
        Shape(USE='Burst')])]),
    TimeSensor(DEF='TIMER',cycleInterval=4,loop=True),
    #  Note direction of rotation is negative, since we are rotating the position of a Viewpoint looking down the default -Z axis 
    OrientationInterpolator(DEF='SPINNER',key=[0,.5,1],keyValue=[(0,1,0,0),(0,1,0,-3.1416),(0,1,0,-6.2832)]),
    ROUTE(fromField='fraction_changed',fromNode='TIMER',toField='set_fraction',toNode='SPINNER'),
    ROUTE(fromField='value_changed',fromNode='SPINNER',toField='set_rotation',toNode='SPINNING_VIEWPOINT_PARENT_TRANSFORM')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure16_3ColoredLinesStarburst.py:')
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

print("python Figure16_3ColoredLinesStarburst.py load and self-test diagnostics complete.")
