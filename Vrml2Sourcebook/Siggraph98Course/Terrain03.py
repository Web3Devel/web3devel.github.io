####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Terrrain03.py
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

newModel=X3D(profile='Interactive',version='3.3',
  head=head(
    children=[
    meta(content='Terrrain03.x3d',name='title'),
    meta(content='Terrain snapshot providing an animation keyframe for AnimatedGrid.x3d',name='description'),
    meta(content='David R. Nadeau, John L. Moreland, Michael M. Heck',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='AnimatedGrid.x3d',name='reference'),
    meta(content='originals/ter03.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0495.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrrain03.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Terrrain03.x3d'),
    Transform(translation=(-7.5,0.0,-7.5),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(),),
        geometry=ElevationGrid(creaseAngle=1.571,height=[0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,-1.09,-1.85,-1.38,0.0,1.38,1.85,1.09,-0.39,-1.61,-1.77,-0.76,0.76,1.77,1.61,0.39,-1.46,-2.47,-1.85,0.0,1.85,2.47,1.46,-0.52,-2.15,-2.37,-1.01,1.01,2.37,2.15,0.52,-0.86,-1.46,-1.09,0.0,1.09,1.46,0.86,-0.31,-1.27,-1.4,-0.6,0.6,1.4,1.27,0.31,0.31,0.52,0.39,0.0,-0.39,-0.52,-0.31,0.11,0.45,0.49,0.21,-0.21,-0.49,-0.45,-0.11,1.27,2.15,1.61,0.0,-1.61,-2.15,-1.27,0.45,1.88,2.06,0.88,-0.88,-2.06,-1.88,-0.45,1.4,2.37,1.77,0.0,-1.77,-2.37,-1.4,0.49,2.06,2.26,0.97,-0.97,-2.26,-2.06,-0.49,0.6,1.01,0.76,0.0,-0.76,-1.01,-0.6,0.21,0.88,0.97,0.41,-0.41,-0.97,-0.88,-0.21,-0.6,-1.01,-0.76,0.0,0.76,1.01,0.6,-0.21,-0.88,-0.97,-0.41,0.41,0.97,0.88,0.21,-1.4,-2.37,-1.77,0.0,1.77,2.37,1.4,-0.49,-2.06,-2.26,-0.97,0.97,2.26,2.06,0.49,-1.27,-2.15,-1.61,0.0,1.61,2.15,1.27,-0.45,-1.88,-2.06,-0.88,0.88,2.06,1.88,0.45,-0.31,-0.52,-0.39,0.0,0.39,0.52,0.31,-0.11,-0.45,-0.49,-0.21,0.21,0.49,0.45,0.11,0.86,1.46,1.09,0.0,-1.09,-1.46,-0.86,0.31,1.27,1.4,0.6,-0.6,-1.4,-1.27,-0.31,1.46,2.47,1.85,0.0,-1.85,-2.47,-1.46,0.52,2.15,2.37,1.01,-1.01,-2.37,-2.15,-0.52,1.09,1.85,1.38,0.0,-1.38,-1.85,-1.09,0.39,1.61,1.77,0.76,-0.76,-1.77,-1.61,-0.39],solid=False,xDimension=15,zDimension=15,
          color=Color(color=[(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0),(0.44,0.0,0.56),(0.74,0.0,0.26),(0.55,0.0,0.45),(0.0,0.0,1.0),(0.55,0.0,0.45),(0.74,0.0,0.26),(0.44,0.0,0.56),(0.15,0.0,0.85),(0.64,0.0,0.36),(0.71,0.0,0.29),(0.3,0.0,0.7),(0.3,0.0,0.7),(0.71,0.0,0.29),(0.64,0.0,0.36),(0.15,0.0,0.85),(0.58,0.0,0.42),(0.99,0.0,0.01),(0.74,0.0,0.26),(0.0,0.0,1.0),(0.74,0.0,0.26),(0.99,0.0,0.01),(0.58,0.0,0.42),(0.21,0.0,0.79),(0.86,0.0,0.14),(0.95,0.0,0.05),(0.4,0.0,0.6),(0.4,0.0,0.6),(0.95,0.0,0.05),(0.86,0.0,0.14),(0.21,0.0,0.79),(0.35,0.0,0.65),(0.58,0.0,0.42),(0.44,0.0,0.56),(0.0,0.0,1.0),(0.44,0.0,0.56),(0.58,0.0,0.42),(0.35,0.0,0.65),(0.12,0.0,0.88),(0.51,0.0,0.49),(0.56,0.0,0.44),(0.24,0.0,0.76),(0.24,0.0,0.76),(0.56,0.0,0.44),(0.51,0.0,0.49),(0.12,0.0,0.88),(0.12,0.0,0.88),(0.21,0.0,0.79),(0.15,0.0,0.85),(0.0,0.0,1.0),(0.15,0.0,0.85),(0.21,0.0,0.79),(0.12,0.0,0.88),(0.04,0.0,0.96),(0.18,0.0,0.82),(0.2,0.0,0.8),(0.08,0.0,0.92),(0.08,0.0,0.92),(0.2,0.0,0.8),(0.18,0.0,0.82),(0.04,0.0,0.96),(0.51,0.0,0.49),(0.86,0.0,0.14),(0.64,0.0,0.36),(0.0,0.0,1.0),(0.64,0.0,0.36),(0.86,0.0,0.14),(0.51,0.0,0.49),(0.18,0.0,0.82),(0.75,0.0,0.25),(0.82,0.0,0.18),(0.35,0.0,0.65),(0.35,0.0,0.65),(0.82,0.0,0.18),(0.75,0.0,0.25),(0.18,0.0,0.82),(0.56,0.0,0.44),(0.95,0.0,0.05),(0.71,0.0,0.29),(0.0,0.0,1.0),(0.71,0.0,0.29),(0.95,0.0,0.05),(0.56,0.0,0.44),(0.2,0.0,0.8),(0.82,0.0,0.18),(0.9,0.0,0.1),(0.39,0.0,0.61),(0.39,0.0,0.61),(0.9,0.0,0.1),(0.82,0.0,0.18),(0.2,0.0,0.8),(0.24,0.0,0.76),(0.4,0.0,0.6),(0.3,0.0,0.7),(0.0,0.0,1.0),(0.3,0.0,0.7),(0.4,0.0,0.6),(0.24,0.0,0.76),(0.08,0.0,0.92),(0.35,0.0,0.65),(0.39,0.0,0.61),(0.17,0.0,0.83),(0.17,0.0,0.83),(0.39,0.0,0.61),(0.35,0.0,0.65),(0.08,0.0,0.92),(0.24,0.0,0.76),(0.4,0.0,0.6),(0.3,0.0,0.7),(0.0,0.0,1.0),(0.3,0.0,0.7),(0.4,0.0,0.6),(0.24,0.0,0.76),(0.08,0.0,0.92),(0.35,0.0,0.65),(0.39,0.0,0.61),(0.17,0.0,0.83),(0.17,0.0,0.83),(0.39,0.0,0.61),(0.35,0.0,0.65),(0.08,0.0,0.92),(0.56,0.0,0.44),(0.95,0.0,0.05),(0.71,0.0,0.29),(0.0,0.0,1.0),(0.71,0.0,0.29),(0.95,0.0,0.05),(0.56,0.0,0.44),(0.2,0.0,0.8),(0.82,0.0,0.18),(0.9,0.0,0.1),(0.39,0.0,0.61),(0.39,0.0,0.61),(0.9,0.0,0.1),(0.82,0.0,0.18),(0.2,0.0,0.8),(0.51,0.0,0.49),(0.86,0.0,0.14),(0.64,0.0,0.36),(0.0,0.0,1.0),(0.64,0.0,0.36),(0.86,0.0,0.14),(0.51,0.0,0.49),(0.18,0.0,0.82),(0.75,0.0,0.25),(0.82,0.0,0.18),(0.35,0.0,0.65),(0.35,0.0,0.65),(0.82,0.0,0.18),(0.75,0.0,0.25),(0.18,0.0,0.82),(0.12,0.0,0.88),(0.21,0.0,0.79),(0.15,0.0,0.85),(0.0,0.0,1.0),(0.15,0.0,0.85),(0.21,0.0,0.79),(0.12,0.0,0.88),(0.04,0.0,0.96),(0.18,0.0,0.82),(0.2,0.0,0.8),(0.08,0.0,0.92),(0.08,0.0,0.92),(0.2,0.0,0.8),(0.18,0.0,0.82),(0.04,0.0,0.96),(0.35,0.0,0.65),(0.58,0.0,0.42),(0.44,0.0,0.56),(0.0,0.0,1.0),(0.44,0.0,0.56),(0.58,0.0,0.42),(0.35,0.0,0.65),(0.12,0.0,0.88),(0.51,0.0,0.49),(0.56,0.0,0.44),(0.24,0.0,0.76),(0.24,0.0,0.76),(0.56,0.0,0.44),(0.51,0.0,0.49),(0.12,0.0,0.88),(0.58,0.0,0.42),(0.99,0.0,0.01),(0.74,0.0,0.26),(0.0,0.0,1.0),(0.74,0.0,0.26),(0.99,0.0,0.01),(0.58,0.0,0.42),(0.21,0.0,0.79),(0.86,0.0,0.14),(0.95,0.0,0.05),(0.4,0.0,0.6),(0.4,0.0,0.6),(0.95,0.0,0.05),(0.86,0.0,0.14),(0.21,0.0,0.79),(0.44,0.0,0.56),(0.74,0.0,0.26),(0.55,0.0,0.45),(0.0,0.0,1.0),(0.55,0.0,0.45),(0.74,0.0,0.26),(0.44,0.0,0.56),(0.15,0.0,0.85),(0.64,0.0,0.36),(0.71,0.0,0.29),(0.3,0.0,0.7),(0.3,0.0,0.7),(0.71,0.0,0.29),(0.64,0.0,0.36),(0.15,0.0,0.85)])))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Terrrain03.py:')
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

print("python Terrrain03.py load and self-test diagnostics complete.")
