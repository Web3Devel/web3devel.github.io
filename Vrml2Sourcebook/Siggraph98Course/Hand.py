####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Hand.py
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
    meta(content='Hand.x3d',name='title'),
    meta(content='Robotic hand juggling primitives: this scene illustrates the use of the primitive shapes and a lot of nested Transform nodes to created articulated structures.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='3 September 2023',name='modified'),
    meta(content='Hand.png',name='Image'),
    meta(content='originals/hand.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0063.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0115.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Hand.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  Each of the finger joints are controlled by a separate rotation. Changing the rotation angles (by editing this file) will open and close the hand. 
    #  For convenience, each of the hand's parts are spearately authored within a Switch node whose 'whichChoice' field is set to -1 which forces the parts to be skipped during drawing. The parts in the Switch, however, are assembled later in a 'hand' shape at the end of the Switch, and that shape is then instanced outside of the Switch. The effect is to create a file structure that enables you to build things piece by piece, then use Transform's later on to assemble those pieces into a drawn shape. 
    children=[
    WorldInfo(info=["copyright (c) 1997, David R. Nadeau"],title='Robotic hand juggling primitives'),
    Viewpoint(description='Entry view'),
    NavigationInfo(),
    Switch(whichChoice=-1,
      children=[
      Shape(
        appearance=Appearance(DEF='HandColor',
          material=Material(ambientIntensity=0.3,diffuseColor=(0.3,0.3,0.5),shininess=0.1,specularColor=(0.7,0.7,0.8)))),
      Group(DEF='finger_base',
        children=[
        Shape(
          appearance=Appearance(USE='HandColor'),
          geometry=Sphere(radius=0.41)),
        Transform(translation=(0.0,0.875,0.0),
          children=[
          Shape(
            appearance=Appearance(USE='HandColor'),
            geometry=Cylinder(height=1.75,radius=0.35)),
          Transform(translation=(0.0,0.835,0.0),
            children=[
            Shape(
              appearance=Appearance(USE='HandColor'),
              geometry=Sphere(radius=0.35))])])]),
      Transform(DEF='finger_middle',translation=(0.0,0.5,0.0),
        children=[
        Shape(
          appearance=Appearance(USE='HandColor'),
          geometry=Cylinder(height=1.0,radius=0.315)),
        Transform(translation=(0.0,0.5,0.0),
          children=[
          Shape(
            appearance=Appearance(USE='HandColor'),
            geometry=Sphere(radius=0.32))])]),
      Transform(DEF='finger_tip',rotation=(1.0,0.0,0.0,-0.1),
        children=[
        Transform(translation=(0.0,0.4,0.0),
          children=[
          Shape(
            appearance=Appearance(USE='HandColor'),
            geometry=Cylinder(height=0.75,radius=0.27)),
          Transform(scale=(1.0,0.7,1.0),translation=(0.0,0.35,0.0),
            children=[
            Shape(
              appearance=Appearance(USE='HandColor'),
              geometry=Sphere(radius=0.235))])])]),
      Transform(DEF='finger1',rotation=(0.0,0.0,1.0,0.035),
        children=[
        Transform(rotation=(0.0,1.0,0.0,-0.03),
          children=[
          Transform(rotation=(1.0,0.0,0.0,-0.2),
            children=[
            Group(USE='finger_base'),
            Transform(rotation=(1.0,0.0,0.0,-0.2),translation=(0.0,1.71,0.0),
              children=[
              Transform(USE='finger_middle'),
              Transform(rotation=(1.0,0.0,0.0,-0.2),translation=(0.0,1.0,0.0),
                children=[
                Transform(USE='finger_tip')])])])])]),
      Transform(DEF='finger2',scale=(1.01,1.15,1.01),
        children=[
        Transform(
          children=[
          Transform(rotation=(1.0,0.0,0.0,-0.4),translation=(0.0,0.2,0.0),
            children=[
            Group(USE='finger_base'),
            Transform(rotation=(1.0,0.0,0.0,-0.4),translation=(0.0,1.71,0.0),
              children=[
              Transform(USE='finger_middle'),
              Transform(rotation=(1.0,0.0,0.0,-0.4),translation=(0.0,1.0,0.0),
                children=[
                Transform(USE='finger_tip')])])])])]),
      Transform(DEF='finger3',rotation=(0.0,0.0,1.0,-0.0175),scale=(1.0,1.05,1.0),
        children=[
        Transform(rotation=(0.0,1.0,0.0,0.065),
          children=[
          Transform(rotation=(1.0,0.0,0.0,-0.6),translation=(0.0,0.1,0.0),
            children=[
            Group(USE='finger_base'),
            Transform(rotation=(1.0,0.0,0.0,-0.4),translation=(0.0,1.71,0.0),
              children=[
              Transform(USE='finger_middle'),
              Transform(rotation=(1.0,0.0,0.0,-0.4),translation=(0.0,1.0,0.0),
                children=[
                Transform(USE='finger_tip')])])])])]),
      Transform(DEF='finger4',rotation=(0.0,0.0,1.0,-0.0698),scale=(0.9,0.9,0.9),
        children=[
        Transform(rotation=(0.0,1.0,0.0,0.1),
          children=[
          Transform(rotation=(1.0,0.0,0.0,-0.7),translation=(0.0,-0.2,0.0),
            children=[
            Group(USE='finger_base'),
            Transform(rotation=(1.0,0.0,0.0,-0.4),translation=(0.0,1.71,0.0),
              children=[
              Transform(USE='finger_middle'),
              Transform(rotation=(1.0,0.0,0.0,-0.4),translation=(0.0,1.0,0.0),
                children=[
                Transform(USE='finger_tip')])])])])]),
      Transform(DEF='thumb',rotation=(0.0,0.0,1.0,0.7),
        children=[
        Transform(rotation=(0.0,0.0,1.0,0.1),
          children=[
          Transform(rotation=(0.0,1.0,0.0,-0.9),scale=(0.7,0.7,0.8),
            children=[
            Shape(
              appearance=Appearance(USE='HandColor'),
              geometry=Sphere(radius=0.9)),
            Transform(translation=(0.0,1.1,0.0),
              children=[
              Shape(
                appearance=Appearance(USE='HandColor'),
                geometry=Cylinder(radius=0.55)),
              Transform(translation=(0.0,0.85,0.0),
                children=[
                Shape(
                  appearance=Appearance(USE='HandColor'),
                  geometry=Sphere(radius=0.58)),
                Transform(rotation=(1.0,0.0,0.0,0.08),
                  children=[
                  Transform(translation=(0.0,0.6,0.0),
                    children=[
                    Shape(
                      appearance=Appearance(USE='HandColor'),
                      geometry=Cylinder(height=1.2,radius=0.41)),
                    Transform(translation=(0.0,0.6,0.0),
                      children=[
                      Shape(
                        appearance=Appearance(USE='HandColor'),
                        geometry=Sphere(radius=0.45)),
                      Transform(rotation=(1.0,0.0,0.0,0.13),
                        children=[
                        Transform(rotation=(1.0,0.0,0.0,-0.1),
                          children=[
                          Transform(translation=(0.0,0.5,0.05),
                            children=[
                            Shape(
                              appearance=Appearance(USE='HandColor'),
                              geometry=Cylinder(height=1.0,radius=0.325)),
                            Transform(scale=(1.0,0.7,1.0),translation=(0.0,0.5,0.0),
                              children=[
                              Shape(
                                appearance=Appearance(USE='HandColor'),
                                geometry=Sphere(radius=0.29))])])])])])])])])])])])]),
      Group(DEF='palm',
        children=[
        Transform(translation=(-0.05,0.875,-0.03),
          children=[
          Shape(
            appearance=Appearance(USE='HandColor'),
            geometry=Box(size=(2.85,2.45,0.6)))]),
        Transform(scale=(1.1,0.7,0.3),translation=(-0.9,0.2,-0.2),
          children=[
          Shape(
            appearance=Appearance(USE='HandColor'),
            geometry=Sphere(radius=1.1))]),
        Transform(scale=(0.9,0.8,0.3),translation=(0.5,0.0,-0.2),
          children=[
          Shape(
            appearance=Appearance(USE='HandColor'),
            geometry=Sphere(),)]),
        Transform(scale=(1.5,1.0,1.0),translation=(0.0,-0.6,0.0),
          children=[
          Transform(rotation=(1.0,0.0,0.0,-0.4),
            children=[
            Shape(
              appearance=Appearance(USE='HandColor'),
              geometry=Cylinder(height=0.1,radius=1.1)),
            Transform(translation=(0.0,-0.3,0.0),
              children=[
              Shape(
                appearance=Appearance(USE='HandColor'),
                geometry=Sphere(radius=0.8)),
              Shape(
                appearance=Appearance(USE='HandColor'),
                geometry=Cylinder(height=0.1,radius=1.1)),
              Transform(translation=(0.0,-1.3,0.0),
                children=[
                Shape(
                  appearance=Appearance(USE='HandColor'),
                  geometry=Cylinder(radius=0.6))])])])]),
        Transform(translation=(0.0,-0.475,0.345),
          children=[
          Transform(rotation=(0.0,0.0,1.0,0.15),
            children=[
            Transform(DEF='vein',translation=(0.0,1.375,0.0),
              children=[
              Shape(
                appearance=Appearance(USE='HandColor'),
                geometry=Cylinder(height=2.85,radius=0.15))])]),
          Transform(rotation=(0.0,0.0,1.0,0.45),
            children=[
            Transform(USE='vein')]),
          Transform(rotation=(0.0,0.0,1.0,-0.15),
            children=[
            Transform(USE='vein')]),
          Transform(rotation=(0.0,0.0,1.0,-0.45),
            children=[
            Transform(USE='vein')]),
          Transform(rotation=(0.0,0.0,1.0,1.15),
            children=[
            Transform(translation=(0.0,0.875,0.0),
              children=[
              Shape(
                appearance=Appearance(USE='HandColor'),
                geometry=Cylinder(height=1.75,radius=0.15))])])])]),
      Group(DEF='hand',
        children=[
        Transform(USE='finger1'),
        Transform(translation=(0.8,0.0,0.0),
          children=[
          Transform(USE='finger2'),
          Transform(translation=(0.8,0.0,0.0),
            children=[
            Transform(USE='finger3'),
            Transform(translation=(0.8,0.0,0.0),
              children=[
              Transform(USE='finger4')])])]),
        Transform(translation=(-0.4,-2.0,0.0),
          children=[
          Transform(USE='thumb')]),
        Transform(translation=(1.2,-2.2,0.0),
          children=[
          Group(USE='palm')])])]),
    Transform(rotation=(0.0,1.0,0.0,1.0),translation=(0.0,-2.0,0.0),
      children=[
      Transform(rotation=(1.0,0.0,0.0,1.9),
        children=[
        Group(USE='hand')])]),
    Transform(rotation=(1.0,0.0,1.0,0.3),translation=(1.5,1.0,0.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(1.0,0.0,0.0))),
        geometry=Cone(),)]),
    Transform(translation=(2.0,3.0,-0.5),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(1.0,1.0,0.0))),
        geometry=Sphere(),)]),
    Transform(rotation=(1.0,0.0,0.2,0.82),translation=(-0.6,0.8,0.5),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,0.7,1.0))),
        geometry=Cylinder(height=1.5,radius=0.75))]),
    Transform(rotation=(1.0,0.0,0.7,1.3),translation=(0.0,2.6,-1.1),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,1.0,0.0))),
        geometry=Box(size=(1.25,1.25,1.25)))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Hand.py:')
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

print("python Hand.py load and self-test diagnostics complete.")
