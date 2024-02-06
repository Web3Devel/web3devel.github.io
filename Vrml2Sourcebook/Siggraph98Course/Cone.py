###############################################
#
# Now available: developmental python x3d.py package on PyPi for import.
#   This approach greatly simplifies Python X3D deployment and use.
#   https://pypi.org/project/x3d
#
# Installation:
#       pip install x3d
# or
#       python -m pip install x3d
#
# Developer options for loading x3d package:
#
#    from x3d import *  # preferred approach, terser source that avoids x3d.* class prefixes
#
# or
#    import x3d         # traditional way to subclass x3d package, all classes require x3d.* prefix
#                       # but python source is very verbose, for example x3d.Material x3d.Shape etc.
#                       # X3dToPython.xslt stylesheet insertPackagePrefix=true supports this option.

from x3d import *

###############################################

newModel=X3D(profile='Interchange',version='3.3',
  head=head(
    children=[
    meta(content='Cone.x3d',name='title'),
    meta(content='Primitive geometry: Cone.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/cone.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0035.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Cone.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Cone.x3d'),
    Shape(
      appearance=Appearance(
        material=Material(),),
      geometry=Cone(),)])
) # X3D model complete

###############################################
# Self-test diagnostics
###############################################

if        metaDiagnostics(newModel): # built-in utility method in X3D class
    print(metaDiagnostics(newModel))
print('checking newModel.toXML() serialization...')
newModelXML = newModel.toXML() # test toXML() for exceptions
# print(newModelXML) # debug

print ("python x3d.py load successful for Cone.py")
