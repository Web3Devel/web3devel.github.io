####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python One.py
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
    meta(content='One.x3d',name='title'),
    meta(content='Tumbling Boxes: this world builds a batch of perpetually tumbling boxes.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Loader.x3d',name='reference'),
    meta(content='originals/one.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0465.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0469.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/One.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1998, David R. Nadeau"],title='Tumbling Boxes'),
    ExternProtoDeclare(name='TumbleGroup',url=["TumbleGroup.x3d#TumbleGroup","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/TumbleGroup.x3d#TumbleGroup","TumbleGroup.wrl#TumbleGroup","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/TumbleGroup.wrl#TumbleGroup"],
      field=[
      field(accessType='initializeOnly',name='xTumbleInterval',type='SFTime'),
      field(accessType='initializeOnly',name='children',type='MFNode'),
      field(accessType='initializeOnly',name='zTumbleInterval',type='SFTime'),
      field(accessType='initializeOnly',name='translation',type='SFVec3f'),
      field(accessType='initializeOnly',name='yTumbleInterval',type='SFTime')]),
    ProtoInstance(name='TumbleGroup',
      fieldValue=[
      fieldValue(name='xTumbleInterval',value=27.0),
      fieldValue(name='children',
        children=[
        Shape(DEF='Block',
          appearance=Appearance(
            material=Material(),
            texture=ImageTexture(url=["brtsky.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/brtsky.jpg"])),
          geometry=Box(size=(4.0,4.0,4.0)))]),
      fieldValue(name='zTumbleInterval',value=45.0),
      fieldValue(name='yTumbleInterval',value=13.0)]),
    ProtoInstance(name='TumbleGroup',
      fieldValue=[
      fieldValue(name='xTumbleInterval',value=29.0),
      fieldValue(name='children',
        children=[
        Shape(USE='Block')]),
      fieldValue(name='zTumbleInterval',value=25.0),
      fieldValue(name='yTumbleInterval',value=31.0)]),
    ProtoInstance(name='TumbleGroup',
      fieldValue=[
      fieldValue(name='xTumbleInterval',value=38.0),
      fieldValue(name='children',
        children=[
        Shape(USE='Block')]),
      fieldValue(name='zTumbleInterval',value=43.0),
      fieldValue(name='yTumbleInterval',value=27.0)])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for One.py:')
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

print("python One.py load and self-test diagnostics complete.")
