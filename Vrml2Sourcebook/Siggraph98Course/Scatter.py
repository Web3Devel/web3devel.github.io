####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Scatter.py
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
    meta(content='Scatter.x3d',name='title'),
    meta(content='Controlling color on coordinate-based geometry: PointSet example.',name='description'),
    meta(content='David R. Nadeau, John L. Moreland, Michael M. Heck',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/scatter.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0227.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Scatter.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Scatter.x3d'),
    Viewpoint(description='Entry view'),
    NavigationInfo(),
    Transform(translation=(-5.0,-4.0,0.0),
      children=[
      Shape(
        #  Appearance/Material is superfluous since contained Color values are provided 
        appearance=Appearance(
          material=Material(),),
        geometry=IndexedLineSet(coordIndex=[0,1,-1,0,2,-1],
          color=Color(color=[(1.0,1.0,1.0),(1.0,1.0,1.0),(1.0,1.0,1.0)]),
          coord=Coordinate(point=[(0.0,0.0,0.0),(10.0,0.0,0.0),(0.0,8.0,0.0)]))),
      Shape(
        geometry=PointSet(
          color=Color(color=[(0.0,1.0,0.0),(0.0,1.0,0.0),(1.0,0.0,0.0),(0.0,1.0,1.0),(0.0,1.0,0.0),(0.0,1.0,0.0),(0.0,1.0,1.0),(1.0,0.0,1.0),(0.0,1.0,0.0),(1.0,0.0,0.0),(1.0,0.0,0.0),(1.0,0.0,0.0),(0.0,1.0,1.0),(1.0,0.0,1.0),(1.0,0.0,0.0),(0.0,1.0,0.0),(0.0,0.0,1.0),(0.0,1.0,1.0),(1.0,1.0,1.0),(1.0,1.0,0.0)]),
          coord=Coordinate(point=[(1.0,1.0,0.0),(2.0,4.0,0.0),(3.0,5.0,0.0),(4.0,4.0,0.0),(5.0,6.0,0.0),(6.0,7.0,0.0),(7.0,5.0,0.0),(8.0,6.0,0.0),(9.0,4.0,0.0),(10.0,3.0,0.0),(1.0,3.0,0.0),(2.0,2.0,0.0),(3.0,2.0,0.0),(4.0,1.0,0.0),(5.0,2.0,0.0),(6.0,4.0,0.0),(7.0,3.0,0.0),(8.0,5.0,0.0),(9.0,5.0,0.0),(10.0,6.0,0.0)])))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Scatter.py:')
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

print("python Scatter.py load and self-test diagnostics complete.")
