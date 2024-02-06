####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python RoboBill.py
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
    meta(content='RoboBill.x3d',name='title'),
    meta(content="RoboBill is a Robot Billboard that illustrates the use of Group, Transform, and Billboard groups - navigate around, here's looking at you! The left robot's head rotates in the horizontal plane, the right robot's head rotates in any direction.",name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/robobill.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0093.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/RoboBill.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  Two robots are built with their heads in Billboard groups, but their torsos left out of it. As the viewer walks about the robot, the heads always turn to face the viewer. The left robot's head is constrained to rotate about the Y axis, while the right robot's head can rotate freely. 
    #  To make it clear what is, and is not moving to track the viewer, the torso of the robot remains fixed, as does a background of blue slabs. 
    #  Things to experiment with: 
    #  Place the entire robot in the Billboard group so that the whole robot tracks the viewer, not just the robot's head. 
    #  Add textures to the environment. 
    #  Add light sources, such as one placed in the lower ball of the robot. Make that ball emissive as well so that it looks like the ball is the source of light. Remember to put the light source inside the robot's transform group so that as the robot moves, the light source moves with it. 
    #  Add behavior to the robot. Make it move on its own! 
    #  
    children=[
    WorldInfo(info=["Copyright (c) 1998, David R. Nadeau"],title='Robot Billboard'),
    Viewpoint(DEF='Entry',description='Entry view',position=(0.0,3.0,12.0)),
    NavigationInfo(),
    Background(),
    Transform(scale=(2.0,2.0,2.0),translation=(-2.0,1.0,0.0),
      children=[
      Inline(DEF='RoboBody',url=["robobody.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/robobody.x3d","robobody.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/robobody.wrl"]),
      Transform(translation=(0.0,1.4,0.0),
        children=[
        Billboard(
          children=[
          Inline(DEF='RoboHead',url=["robohead.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/robohead.x3d","robohead.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/robohead.wrl"])])])]),
    Transform(scale=(2.0,2.0,2.0),translation=(2.0,1.0,0.0),
      children=[
      Inline(USE='RoboBody'),
      Transform(translation=(0.0,1.4,0.0),
        children=[
        Billboard(axisOfRotation=(0.0,0.0,0.0),
          children=[
          Inline(USE='RoboHead')])])]),
    Transform(translation=(0.0,2.0,-6.0),
      children=[
      Shape(DEF='Slab',
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,0.1,0.5),emissiveColor=(0.0,0.3,0.5))),
        geometry=Box(size=(2.0,4.0,0.3)))]),
    Transform(translation=(-6.0,2.0,0.0),
      children=[
      Shape(USE='Slab')]),
    Transform(translation=(6.0,2.0,0.0),
      children=[
      Shape(USE='Slab')]),
    Transform(translation=(-4.3,2.0,-4.3),
      children=[
      Shape(USE='Slab')]),
    Transform(translation=(4.3,2.0,-4.3),
      children=[
      Shape(USE='Slab')])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for RoboBill.py:')
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

print("python RoboBill.py load and self-test diagnostics complete.")
