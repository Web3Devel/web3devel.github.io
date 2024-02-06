####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Shiny.py
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
    meta(content='Shiny.x3d',name='title'),
    meta(content='The shiny spheres world creates a set of spheres, each given a different set of material attributes. The attributes illustrate creation of lic surfaces by using the specularColor, shininess, and ambientIntensity fields along with the standard diffuseColor field.',name='description'),
    meta(content='David R. Nadeau, John L. Moreland, Michael M. Heck',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/shiny.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0082.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Shiny.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Shiny.x3d'),
    Transform(translation=(-2.0,1.0,0.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(ambientIntensity=0.3,diffuseColor=(0.3,0.3,0.5),shininess=0.1,specularColor=(0.7,0.7,0.8))),
        geometry=Sphere(),)]),
    Transform(translation=(0.0,1.0,0.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(ambientIntensity=0.26,diffuseColor=(0.3,0.11,0.0),shininess=0.08,specularColor=(0.75,0.33,0.0))),
        geometry=Sphere(),)]),
    Transform(translation=(2.0,1.0,0.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(ambientIntensity=0.4,diffuseColor=(0.22,0.15,0.0),shininess=0.16,specularColor=(0.71,0.7,0.56))),
        geometry=Sphere(),)]),
    Transform(translation=(-2.0,-1.0,0.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(ambientIntensity=0.17,diffuseColor=(0.1,0.03,0.22),specularColor=(0.64,0.0,0.98))),
        geometry=Sphere(),)]),
    Transform(translation=(0.0,-1.0,0.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(ambientIntensity=0.15,diffuseColor=(0.27,0.0,0.0),specularColor=(0.61,0.13,0.18))),
        geometry=Sphere(),)]),
    Transform(translation=(2.0,-1.0,0.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(ambientIntensity=0.1,diffuseColor=(0.2,0.2,0.71),shininess=0.12,specularColor=(0.83,0.83,0.83))),
        geometry=Sphere(),)])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Shiny.py:')
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

print("python Shiny.py load and self-test diagnostics complete.")
