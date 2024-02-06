####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Figure31_7DonutExternalPrototype.py
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

newModel=X3D(profile='Immersive',version='3.0',
  head=head(
    children=[
    meta(content='Figure31_7DonutExternalPrototype.x3d',name='title'),
    meta(content='Figure 31.7, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland',name='creator'),
    meta(content='http://www.wiley.com/legacy/compbooks/vrml2sbk/ch31/31fig07.htm',name='reference'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='22 November 2000',name='created'),
    meta(content='16 December 2023',name='modified'),
    meta(content='A donut shape built using prototypes: the Donut geometry node and the LightOak appearance node. Also see Figures 30.5 and 31.6 for comparison.',name='description'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_7DonutExternalPrototype.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Figure31_7DonutExternalPrototype.x3d'),
    ExternProtoDeclare(name='Donut',url=["Figure31_6DonutPrototype.wrl#Donut","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_6DonutPrototype.wrl#Donut","Figure31_6DonutPrototype.x3d#Donut","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_6DonutPrototype.x3d#Donut"],
      field=[
      field(accessType='initializeOnly',name='crossSectionRadius',type='SFFloat'),
      field(accessType='initializeOnly',name='spineRadius',type='SFFloat'),
      field(accessType='initializeOnly',name='crossSectionResolution',type='SFInt32'),
      field(accessType='initializeOnly',name='spineResolution',type='SFInt32'),
      field(accessType='inputOnly',name='set_crossSectionRadius',type='SFFloat'),
      field(accessType='inputOnly',name='set_spineRadius',type='SFFloat')]),
    ExternProtoDeclare(name='LightOak',url=["Figure31_4WoodAppearancePrototypesLibrary.wrl#LightOak","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_4WoodAppearancePrototypesLibrary.wrl#LightOak","Figure31_4WoodAppearancePrototypesLibrary.x3d#LightOak","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter31Prototypes/Figure31_4WoodAppearancePrototypesLibrary.x3d#LightOak"],
      field=[
      field(accessType='inputOutput',name='textureTransform',type='SFNode')]),
    Viewpoint(description='Click to pick a size',orientation=(1,0,0,-0.52),position=(0,7,12)),
    #  Donut instances from prototypes 
    Transform(translation=(0,2,0),
      children=[
      Shape(
        geometry=ProtoInstance(name='Donut',
          fieldValue=[
          fieldValue(name='crossSectionRadius',value=1),
          fieldValue(name='spineRadius',value=2)]),
        appearance=ProtoInstance(name='LightOak',
          fieldValue=[
          fieldValue(name='textureTransform',
            children=[
            TextureTransform(center=(-0,5),rotation=0.758,scale=(2,0.5),translation=(0.5,0))])]))]),
    #  Hmmm, what size donut do you really want? 
    TimeSensor(DEF='Clock',cycleInterval=10,loop=True),
    ScalarInterpolator(DEF='DonutThickness',key=[0,0.4,0.5,0.9,1],keyValue=[0.75,1.25,1.25,0.75,0.75]),
    Transform(translation=(0,-2,0),
      children=[
      Shape(
        geometry=ProtoInstance(DEF='SpecialtyOfTheHouse',name='Donut',
          fieldValue=[
          fieldValue(name='crossSectionRadius',value=0.5),
          fieldValue(name='spineRadius',value=2)]),
        appearance=Appearance(
          texture=ImageTexture(url=["../Chapter17Textures/icing.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter17Textures/icing.jpg"]))),
      TouchSensor(DEF='StopSizeChanges',description='touch to stop size changes')]),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='DonutThickness'),
    ROUTE(fromField='value_changed',fromNode='DonutThickness',toField='crossSectionRadius',toNode='SpecialtyOfTheHouse'),
    ROUTE(fromField='touchTime',fromNode='StopSizeChanges',toField='stopTime',toNode='Clock')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Figure31_7DonutExternalPrototype.py:')
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

print("python Figure31_7DonutExternalPrototype.py load and self-test diagnostics complete.")