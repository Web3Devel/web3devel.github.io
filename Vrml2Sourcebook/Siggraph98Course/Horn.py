####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Horn.py
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
    meta(content='Horn.x3d',name='title'),
    meta(content='Horn scene illustrates the use of an Extrusion to build a Doctor Seuss-like horn.',name='description'),
    meta(content='David R. Nadeau, John L. Moreland, Michael M. Heck',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/horn.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0219.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Horn.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1997, Andrea L. Ames, David R. Nadeau, John L. Moreland"],title='Horn'),
    Viewpoint(description='Entry view',position=(0.0,1.5,11.0)),
    NavigationInfo(),
    Shape(
      appearance=Appearance(
        material=Material(diffuseColor=(0.9,0.7,0.0))),
      geometry=Extrusion(beginCap=False,creaseAngle=1.57,crossSection=[(1.0,0.0),(0.92,-0.38),(0.71,-0.71),(0.38,-0.92),(0.0,-1.0),(-0.38,-0.92),(-0.71,-0.71),(-0.92,-0.38),(-1.0,0.0),(-0.92,0.38),(-0.71,0.71),(-0.38,0.92),(0.0,1.0),(0.38,0.92),(0.71,0.71),(0.92,0.38),(1.0,0.0)],endCap=False,scale=[(1.2,1.2),(0.778,0.778),(0.756,0.756),(0.734,0.734),(0.712,0.712),(0.69,0.69),(0.668,0.668),(0.646,0.646),(0.625,0.625),(0.603,0.603),(0.581,0.581),(0.559,0.559),(0.537,0.537),(0.515,0.515),(0.493,0.493),(0.471,0.471),(0.45,0.45),(0.428,0.428),(0.406,0.406),(0.384,0.384),(0.362,0.362),(0.34,0.34),(0.318,0.318),(0.296,0.296),(0.275,0.275),(0.253,0.253),(0.231,0.231),(0.209,0.209),(0.187,0.187),(0.165,0.165),(0.143,0.143),(0.121,0.121),(0.1,0.1)],solid=False,spine=[(2.0,0.0,-0.0),(1.85,0.12,-0.77),(1.41,0.24,-1.41),(0.77,0.36,-1.85),(0.0,0.48,-2.0),(-0.77,0.61,-1.85),(-1.41,0.73,-1.41),(-1.85,0.85,-0.77),(-2.0,0.97,0.0),(-1.85,1.09,0.77),(-1.41,1.21,1.41),(-0.77,1.33,1.85),(0.0,1.45,2.0),(0.77,1.58,1.85),(1.41,1.7,1.41),(1.85,1.82,0.77),(2.0,1.94,0.0),(1.85,2.06,-0.77),(1.41,2.18,-1.41),(0.77,2.3,-1.85),(0.0,2.42,-2.0),(-0.77,2.55,-1.85),(-1.41,2.67,-1.41),(-1.85,2.79,-0.77),(-2.0,2.91,0.0),(-1.85,3.03,0.77),(-1.41,3.15,1.41),(-0.77,3.27,1.85),(0.0,3.39,2.0),(0.77,3.52,1.85),(1.41,3.64,1.41),(1.85,3.76,0.77),(2.0,3.88,0.0)]))])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Horn.py:')
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

print("python Horn.py load and self-test diagnostics complete.")
