####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Mountain16.py
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
    meta(content='Mountain16.x3d',name='title'),
    meta(content='Low-resolution mountain.',name='description'),
    meta(content='John L. Moreland',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/mount16.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0201.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Mountain16.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["copyright (c) 1997, John L. Moreland"],title='Low-res Mountain'),
    Viewpoint(description='Entry view',orientation=(1.0,0.0,0.0,-0.2),position=(1.2,0.9,4.0)),
    NavigationInfo(),
    Shape(
      appearance=Appearance(
        material=Material(),),
      geometry=ElevationGrid(height=[0.019608,0.031373,0.043137,0.05098,0.054902,0.054902,0.066667,0.062745,0.062745,0.062745,0.058824,0.054902,0.047059,0.047059,0.035294,0.031373,0.035294,0.035294,0.039216,0.054902,0.062745,0.066667,0.070588,0.070588,0.070588,0.070588,0.098039,0.129412,0.086275,0.078431,0.066667,0.043137,0.039216,0.05098,0.058824,0.07451,0.066667,0.062745,0.054902,0.062745,0.058824,0.066667,0.145098,0.27451,0.227451,0.168627,0.07451,0.05098,0.035294,0.058824,0.070588,0.07451,0.062745,0.058824,0.047059,0.039216,0.054902,0.058824,0.211765,0.356863,0.32549,0.223529,0.07451,0.05098,0.054902,0.070588,0.07451,0.078431,0.054902,0.047059,0.035294,0.027451,0.086275,0.129412,0.231373,0.372549,0.321569,0.231373,0.082353,0.058824,0.054902,0.066667,0.082353,0.07451,0.035294,0.023529,0.027451,0.058824,0.454902,0.517647,0.239216,0.121569,0.094118,0.078431,0.058824,0.058824,0.062745,0.066667,0.07451,0.047059,0.023529,0.027451,0.129412,0.47451,0.815686,0.701961,0.317647,0.054902,0.035294,0.05098,0.066667,0.066667,0.066667,0.062745,0.066667,0.05098,0.031373,0.082353,0.27451,0.780392,0.956863,0.827451,0.25098,0.054902,0.035294,0.047059,0.062745,0.058824,0.078431,0.078431,0.058824,0.054902,0.113725,0.07451,0.282353,0.858824,0.945098,0.745098,0.203922,0.031373,0.027451,0.031373,0.043137,0.062745,0.070588,0.094118,0.109804,0.117647,0.192157,0.282353,0.231373,0.517647,0.92549,0.929412,0.423529,0.027451,0.031373,0.05098,0.058824,0.066667,0.058824,0.082353,0.160784,0.223529,0.329412,0.329412,0.458824,0.733333,0.901961,0.858824,0.607843,0.164706,0.054902,0.047059,0.062745,0.062745,0.058824,0.090196,0.180392,0.254902,0.243137,0.164706,0.443137,0.768627,0.796078,0.772549,0.701961,0.298039,0.290196,0.152941,0.098039,0.066667,0.05098,0.066667,0.101961,0.152941,0.086275,0.094118,0.341176,0.611765,0.662745,0.584314,0.596078,0.470588,0.396078,0.282353,0.137255,0.058824,0.047059,0.054902,0.062745,0.070588,0.058824,0.066667,0.152941,0.388235,0.368627,0.47451,0.439216,0.380392,0.32549,0.164706,0.058824,0.05098,0.035294,0.05098,0.058824,0.062745,0.066667,0.07451,0.133333,0.192157,0.172549,0.098039,0.290196,0.27451,0.133333,0.105882,0.054902,0.047059,0.035294,0.043137,0.05098,0.054902,0.062745,0.066667,0.054902,0.082353,0.098039,0.07451,0.098039,0.078431,0.062745,0.062745,0.054902,0.039216],xDimension=16,xSpacing=0.16,zDimension=16,zSpacing=0.16))])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Mountain16.py:')
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

print("python Mountain16.py load and self-test diagnostics complete.")
