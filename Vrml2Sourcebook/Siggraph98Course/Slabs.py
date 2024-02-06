####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Slabs.py
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
    meta(content='Slabs.x3d',name='title'),
    meta(content='Slab World example illustrates use of Appearance and Material nodes to set the main shading color (diffuseColor), glow color (emissiveColor), and transparency level of a shape.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/slabs.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0080.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Slabs.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  Seven slabs are created, each using a Box node. Each slab is shaded a different material: 
    #  Slab Diffuse Emissive Transparency; 1. White white black 0.0; 2. Red black red 0.0; 3. Green green black 0.5; 4. Blue blue white 0.25; 5. Yellow yellow black 0.5; 6. Cyan cyan black 0.0; 7. Magenta red magenta 0.0 
    #  Some PC browsers may not support transparency. Others may not support shading using both diffuse and emissive colors. So, your results may vary. 
    #  Things to experiment with: 
    #  Try different transparency levels. 
    #  Turn off the headlight on your VRML browser and observe which slabs glow. 
    children=[
    WorldInfo(info=["Copyright (c) 1996, David R. Nadeau"],title='Slab World'),
    Viewpoint(DEF='Entry',description='Entry view',position=(0.0,1.66,15.0)),
    NavigationInfo(),
    Transform(translation=(0.0,2.0,4.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(1.0,1.0,1.0))),
        geometry=Box(DEF='Slab',size=(2.0,4.0,0.3)))]),
    Transform(translation=(0.0,2.0,0.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,0.0,0.0),emissiveColor=(1.0,0.0,0.0))),
        geometry=Box(USE='Slab'))]),
    Transform(translation=(-3.0,2.0,2.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,1.0,0.0),transparency=0.5)),
        geometry=Box(USE='Slab'))]),
    Transform(translation=(4.0,2.0,-2.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.2,0.2,0.2),emissiveColor=(0.0,0.0,0.8),transparency=0.25)),
        geometry=Box(USE='Slab'))]),
    Transform(translation=(4.5,2.0,3.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(1.0,1.0,0.0),transparency=0.5)),
        geometry=Box(USE='Slab'))]),
    Transform(translation=(-3.5,2.0,-5.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,1.0,1.0))),
        geometry=Box(USE='Slab'))]),
    Transform(translation=(2.0,2.0,-6.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.5,0.0,0.0),emissiveColor=(0.5,0.0,0.5))),
        geometry=Box(USE='Slab'))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Slabs.py:')
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

print("python Slabs.py load and self-test diagnostics complete.")
