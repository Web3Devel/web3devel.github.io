####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Table.py
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
    meta(content='Table.x3d',name='title'),
    meta(content='This table is inlined into the dinette scene to illustrate inline groups.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Dinette.x3d',name='reference'),
    meta(content='originals/table.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0098.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Table.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Table.x3d'),
    Viewpoint(description='Table front',orientation=(1,0,0,-0.260602),position=(0,1.6,3)),
    Viewpoint(description='Table right side',orientation=(-0.12885,0.98326,0.12885,1.58768),position=(3,1.6,0)),
    Viewpoint(description='Table back',orientation=(0,0.99152,0.12993,-3.141593),position=(0,1.6,-3)),
    Viewpoint(description='Table left side',orientation=(0.12885,0.98326,0.12885,-1.58768),position=(-3,1.6,0)),
    Viewpoint(description='Table from above',orientation=(1,0,0,-1.570796),position=(0,3,0)),
    #  Table top 
    Transform(translation=(0.0,0.615,0.0),
      children=[
      Shape(
        appearance=Appearance(DEF='Brown',
          material=Material(diffuseColor=(0.6,0.35,0.0))),
        geometry=Cylinder(height=0.03,radius=0.7))]),
    #  Table leg 
    Transform(translation=(0.0,0.3075,0.0),
      children=[
      Shape(
        appearance=Appearance(USE='Brown'),
        geometry=Box(size=(0.09,0.57,0.09)))]),
    #  Table leg base 
    Transform(translation=(0.0,0.015,0.0),
      children=[
      Shape(
        appearance=Appearance(USE='Brown'),
        geometry=Box(size=(0.5,0.03,0.5)))]),
    Transform(translation=(0.0,0.045,0.0),
      children=[
      Shape(
        appearance=Appearance(USE='Brown'),
        geometry=Box(size=(0.35,0.03,0.35)))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Table.py:')
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

print("python Table.py load and self-test diagnostics complete.")
