####################################################################################################
#
# Invoking X3D model self-test:
#
#   $ python Snake.py
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
    meta(content='Snake.x3d',name='title'),
    meta(content='This world creates a morphing snake using an Extrusion node. To make the snake move, a CoordinateInterpolator sends the Extrusion node a series of new spines.',name='description'),
    meta(content='David R. Nadeau',name='creator'),
    meta(content='Don Brutzman',name='translator'),
    meta(content='1 July 1998',name='created'),
    meta(content='2 February 2014',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='originals/snake.wrl',name='reference'),
    meta(content='http://www.siggraph.org/s98',name='reference'),
    meta(content='http://www.siggraph.org/s98/conference/courses/18.html',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0258.htm',name='reference'),
    meta(content='http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Snake.x3d',name='identifier'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='X3D-Edit, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["Copyright (c) 1998, David R. Nadeau"],title='Morphing snake'),
    Viewpoint(description='Entry view',orientation=(1.0,0.0,0.0,-0.785),position=(0.0,6.0,6.0)),
    NavigationInfo(),
    Shape(
      appearance=Appearance(
        material=Material(diffuseColor=(0.4,0.2,0.0))),
      geometry=Box(size=(30.0,0.01,30.0))),
    Transform(translation=(0.0,0.3,0.0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.0,1.0,0.2),shininess=0.05,specularColor=(0.9,0.9,0.0))),
        geometry=Extrusion(DEF='Snake',creaseAngle=1.57,crossSection=[(1.0,0.0),(0.92,-0.38),(0.71,-0.71),(0.38,-0.92),(0.0,-1.0),(-0.38,-0.92),(-0.71,-0.71),(-0.92,-0.38),(-1.0,-0.0),(-0.92,0.38),(-0.71,0.71),(-0.38,0.92),(0.0,1.0),(0.38,0.92),(0.71,0.71),(0.92,0.38),(1.0,0.0)],scale=[(0.05,0.05),(0.3,0.1),(0.5,0.15),(0.25,0.25),(0.25,0.25),(0.28,0.28),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.3,0.3),(0.29,0.29),(0.29,0.29),(0.29,0.29),(0.28,0.28),(0.23,0.23),(0.17,0.17),(0.12,0.12),(0.08,0.08),(0.05,0.05)],spine=[(-5.1,0.0,1.0),(-4.83,0.0,1.0),(-4.55,0.0,1.0),(-4.28,0.0,1.0),(-4.0,0.0,1.0),(-3.72,0.0,0.91),(-3.45,0.0,0.65),(-3.17,0.0,0.27),(-2.9,0.0,-0.16),(-2.62,0.0,-0.56),(-2.34,0.0,-0.86),(-2.07,0.0,-0.99),(-1.79,0.0,-0.95),(-1.52,0.0,-0.73),(-1.24,0.0,-0.37),(-0.97,0.0,0.05),(-0.69,0.0,0.47),(-0.41,0.0,0.79),(-0.14,0.0,0.98),(0.14,0.0,0.98),(0.41,0.0,0.8),(0.69,0.0,0.47),(0.97,0.0,0.06),(1.24,0.0,-0.37),(1.52,0.0,-0.72),(1.79,0.0,-0.95),(2.07,0.0,-0.99),(2.34,0.0,-0.86),(2.62,0.0,-0.57),(2.9,0.0,-0.17),(3.17,0.0,0.26),(3.45,0.0,0.64),(3.72,0.0,0.9),(4.0,0.0,1.0)]))]),
    TimeSensor(DEF='Clock',cycleInterval=4.0,loop=True),
    CoordinateInterpolator(DEF='SnakeWiggle',key=[0.0,0.03,0.07,0.1,0.14,0.17,0.21,0.24,0.28,0.31,0.34,0.38,0.41,0.45,0.48,0.52,0.55,0.59,0.62,0.66,0.69,0.72,0.76,0.79,0.83,0.86,0.9,0.93,0.97,1.0],keyValue=[(-4.83,0.0,1.0),(-4.55,0.0,1.0),(-4.28,0.0,1.0),(-4.0,0.0,1.0),(-3.72,0.0,0.91),(-3.45,0.0,0.67),(-3.17,0.0,0.31),(-2.9,0.0,-0.1),(-2.62,0.0,-0.5),(-2.34,0.0,-0.81),(-2.07,0.0,-0.98),(-1.79,0.0,-0.98),(-1.52,0.0,-0.81),(-1.24,0.0,-0.5),(-0.97,0.0,-0.11),(-0.69,0.0,0.31),(-0.41,0.0,0.67),(-0.14,0.0,0.91),(0.14,0.0,1.0),(0.41,0.0,0.91),(0.69,0.0,0.67),(0.97,0.0,0.31),(1.24,0.0,-0.1),(1.52,0.0,-0.5),(1.79,0.0,-0.81),(2.07,0.0,-0.98),(2.34,0.0,-0.98),(2.62,0.0,-0.81),(2.9,0.0,-0.5),(3.17,0.0,-0.11),(3.45,0.0,0.3),(3.72,0.0,0.66),(4.0,0.0,0.91),(4.28,0.0,1.0),(-4.83,0.0,0.98),(-4.55,0.0,0.98),(-4.28,0.0,0.98),(-4.0,0.0,0.98),(-3.72,0.0,0.98),(-3.45,0.0,0.81),(-3.17,0.0,0.51),(-2.9,0.0,0.11),(-2.62,0.0,-0.3),(-2.34,0.0,-0.66),(-2.07,0.0,-0.91),(-1.79,0.0,-1.0),(-1.52,0.0,-0.92),(-1.24,0.0,-0.68),(-0.97,0.0,-0.32),(-0.69,0.0,0.09),(-0.41,0.0,0.49),(-0.14,0.0,0.8),(0.14,0.0,0.98),(0.41,0.0,0.98),(0.69,0.0,0.82),(0.97,0.0,0.51),(1.24,0.0,0.12),(1.52,0.0,-0.3),(1.79,0.0,-0.66),(2.07,0.0,-0.91),(2.34,0.0,-1.0),(2.62,0.0,-0.92),(2.9,0.0,-0.68),(3.17,0.0,-0.32),(3.45,0.0,0.09),(3.72,0.0,0.49),(4.0,0.0,0.8),(4.28,0.0,0.98),(-4.83,0.0,0.91),(-4.55,0.0,0.91),(-4.28,0.0,0.91),(-4.0,0.0,0.91),(-3.72,0.0,1.0),(-3.45,0.0,0.92),(-3.17,0.0,0.68),(-2.9,0.0,0.32),(-2.62,0.0,-0.09),(-2.34,0.0,-0.49),(-2.07,0.0,-0.8),(-1.79,0.0,-0.97),(-1.52,0.0,-0.98),(-1.24,0.0,-0.82),(-0.97,0.0,-0.51),(-0.69,0.0,-0.12),(-0.41,0.0,0.29),(-0.14,0.0,0.66),(0.14,0.0,0.91),(0.41,0.0,1.0),(0.69,0.0,0.92),(0.97,0.0,0.68),(1.24,0.0,0.33),(1.52,0.0,-0.09),(1.79,0.0,-0.48),(2.07,0.0,-0.8),(2.34,0.0,-0.97),(2.62,0.0,-0.98),(2.9,0.0,-0.82),(3.17,0.0,-0.52),(3.45,0.0,-0.12),(3.72,0.0,0.29),(4.0,0.0,0.65),(4.28,0.0,0.9),(-4.83,0.0,0.8),(-4.55,0.0,0.8),(-4.28,0.0,0.8),(-4.0,0.0,0.8),(-3.72,0.0,0.97),(-3.45,0.0,0.98),(-3.17,0.0,0.82),(-2.9,0.0,0.52),(-2.62,0.0,0.13),(-2.34,0.0,-0.29),(-2.07,0.0,-0.65),(-1.79,0.0,-0.9),(-1.52,0.0,-1.0),(-1.24,0.0,-0.92),(-0.97,0.0,-0.69),(-0.69,0.0,-0.33),(-0.41,0.0,0.08),(-0.14,0.0,0.48),(0.14,0.0,0.79),(0.41,0.0,0.97),(0.69,0.0,0.98),(0.97,0.0,0.82),(1.24,0.0,0.52),(1.52,0.0,0.13),(1.79,0.0,-0.28),(2.07,0.0,-0.65),(2.34,0.0,-0.9),(2.62,0.0,-1.0),(2.9,0.0,-0.92),(3.17,0.0,-0.69),(3.45,0.0,-0.33),(3.72,0.0,0.08),(4.0,0.0,0.48),(4.28,0.0,0.79),(-4.83,0.0,0.65),(-4.55,0.0,0.65),(-4.28,0.0,0.65),(-4.0,0.0,0.65),(-3.72,0.0,0.9),(-3.45,0.0,1.0),(-3.17,0.0,0.92),(-2.9,0.0,0.69),(-2.62,0.0,0.34),(-2.34,0.0,-0.07),(-2.07,0.0,-0.47),(-1.79,0.0,-0.79),(-1.52,0.0,-0.97),(-1.24,0.0,-0.98),(-0.97,0.0,-0.83),(-0.69,0.0,-0.53),(-0.41,0.0,-0.14),(-0.14,0.0,0.28),(0.14,0.0,0.65),(0.41,0.0,0.9),(0.69,0.0,1.0),(0.97,0.0,0.93),(1.24,0.0,0.69),(1.52,0.0,0.34),(1.79,0.0,-0.07),(2.07,0.0,-0.47),(2.34,0.0,-0.79),(2.62,0.0,-0.97),(2.9,0.0,-0.98),(3.17,0.0,-0.83),(3.45,0.0,-0.53),(3.72,0.0,-0.14),(4.0,0.0,0.28),(4.28,0.0,0.64),(-4.83,0.0,0.47),(-4.55,0.0,0.47),(-4.28,0.0,0.47),(-4.0,0.0,0.47),(-3.72,0.0,0.79),(-3.45,0.0,0.97),(-3.17,0.0,0.99),(-2.9,0.0,0.83),(-2.62,0.0,0.53),(-2.34,0.0,0.14),(-2.07,0.0,-0.27),(-1.79,0.0,-0.64),(-1.52,0.0,-0.9),(-1.24,0.0,-1.0),(-0.97,0.0,-0.93),(-0.69,0.0,-0.7),(-0.41,0.0,-0.35),(-0.14,0.0,0.07),(0.14,0.0,0.47),(0.41,0.0,0.79),(0.69,0.0,0.97),(0.97,0.0,0.99),(1.24,0.0,0.83),(1.52,0.0,0.53),(1.79,0.0,0.14),(2.07,0.0,-0.27),(2.34,0.0,-0.64),(2.62,0.0,-0.9),(2.9,0.0,-1.0),(3.17,0.0,-0.93),(3.45,0.0,-0.7),(3.72,0.0,-0.35),(4.0,0.0,0.06),(4.28,0.0,0.46),(-4.83,0.0,0.27),(-4.55,0.0,0.27),(-4.28,0.0,0.27),(-4.0,0.0,0.27),(-3.72,0.0,0.64),(-3.45,0.0,0.9),(-3.17,0.0,1.0),(-2.9,0.0,0.93),(-2.62,0.0,0.7),(-2.34,0.0,0.35),(-2.07,0.0,-0.06),(-1.79,0.0,-0.46),(-1.52,0.0,-0.78),(-1.24,0.0,-0.97),(-0.97,0.0,-0.99),(-0.69,0.0,-0.83),(-0.41,0.0,-0.54),(-0.14,0.0,-0.15),(0.14,0.0,0.27),(0.41,0.0,0.63),(0.69,0.0,0.89),(0.97,0.0,1.0),(1.24,0.0,0.93),(1.52,0.0,0.7),(1.79,0.0,0.35),(2.07,0.0,-0.06),(2.34,0.0,-0.46),(2.62,0.0,-0.78),(2.9,0.0,-0.97),(3.17,0.0,-0.99),(3.45,0.0,-0.84),(3.72,0.0,-0.54),(4.0,0.0,-0.15),(4.28,0.0,0.26),(-4.83,0.0,0.05),(-4.55,0.0,0.05),(-4.28,0.0,0.05),(-4.0,0.0,0.05),(-3.72,0.0,0.46),(-3.45,0.0,0.78),(-3.17,0.0,0.97),(-2.9,0.0,0.99),(-2.62,0.0,0.84),(-2.34,0.0,0.54),(-2.07,0.0,0.16),(-1.79,0.0,-0.26),(-1.52,0.0,-0.63),(-1.24,0.0,-0.89),(-0.97,0.0,-1.0),(-0.69,0.0,-0.93),(-0.41,0.0,-0.71),(-0.14,0.0,-0.36),(0.14,0.0,0.05),(0.41,0.0,0.45),(0.69,0.0,0.78),(0.97,0.0,0.97),(1.24,0.0,0.99),(1.52,0.0,0.84),(1.79,0.0,0.55),(2.07,0.0,0.16),(2.34,0.0,-0.26),(2.62,0.0,-0.63),(2.9,0.0,-0.89),(3.17,0.0,-1.0),(3.45,0.0,-0.93),(3.72,0.0,-0.71),(4.0,0.0,-0.36),(4.28,0.0,0.05),(-4.83,0.0,-0.16),(-4.55,0.0,-0.16),(-4.28,0.0,-0.16),(-4.0,0.0,-0.16),(-3.72,0.0,0.25),(-3.45,0.0,0.63),(-3.17,0.0,0.89),(-2.9,0.0,1.0),(-2.62,0.0,0.94),(-2.34,0.0,0.71),(-2.07,0.0,0.36),(-1.79,0.0,-0.05),(-1.52,0.0,-0.45),(-1.24,0.0,-0.77),(-0.97,0.0,-0.96),(-0.69,0.0,-0.99),(-0.41,0.0,-0.84),(-0.14,0.0,-0.55),(0.14,0.0,-0.16),(0.41,0.0,0.25),(0.69,0.0,0.62),(0.97,0.0,0.89),(1.24,0.0,1.0),(1.52,0.0,0.94),(1.79,0.0,0.71),(2.07,0.0,0.37),(2.34,0.0,-0.04),(2.62,0.0,-0.45),(2.9,0.0,-0.77),(3.17,0.0,-0.96),(3.45,0.0,-0.99),(3.72,0.0,-0.84),(4.0,0.0,-0.55),(4.28,0.0,-0.17),(-4.83,0.0,-0.37),(-4.55,0.0,-0.37),(-4.28,0.0,-0.37),(-4.0,0.0,-0.37),(-3.72,0.0,0.04),(-3.45,0.0,0.44),(-3.17,0.0,0.77),(-2.9,0.0,0.96),(-2.62,0.0,0.99),(-2.34,0.0,0.85),(-2.07,0.0,0.56),(-1.79,0.0,0.17),(-1.52,0.0,-0.25),(-1.24,0.0,-0.62),(-0.97,0.0,-0.88),(-0.69,0.0,-1.0),(-0.41,0.0,-0.94),(-0.14,0.0,-0.72),(0.14,0.0,-0.37),(0.41,0.0,0.04),(0.69,0.0,0.44),(0.97,0.0,0.77),(1.24,0.0,0.96),(1.52,0.0,0.99),(1.79,0.0,0.85),(2.07,0.0,0.56),(2.34,0.0,0.17),(2.62,0.0,-0.24),(2.9,0.0,-0.62),(3.17,0.0,-0.88),(3.45,0.0,-1.0),(3.72,0.0,-0.94),(4.0,0.0,-0.72),(4.28,0.0,-0.38),(-4.83,0.0,-0.56),(-4.55,0.0,-0.56),(-4.28,0.0,-0.56),(-4.0,0.0,-0.56),(-3.72,0.0,-0.18),(-3.45,0.0,0.24),(-3.17,0.0,0.61),(-2.9,0.0,0.88),(-2.62,0.0,1.0),(-2.34,0.0,0.94),(-2.07,0.0,0.72),(-1.79,0.0,0.38),(-1.52,0.0,-0.03),(-1.24,0.0,-0.44),(-0.97,0.0,-0.76),(-0.69,0.0,-0.96),(-0.41,0.0,-0.99),(-0.14,0.0,-0.85),(0.14,0.0,-0.56),(0.41,0.0,-0.18),(0.69,0.0,0.24),(0.97,0.0,0.61),(1.24,0.0,0.88),(1.52,0.0,1.0),(1.79,0.0,0.94),(2.07,0.0,0.72),(2.34,0.0,0.38),(2.62,0.0,-0.03),(2.9,0.0,-0.43),(3.17,0.0,-0.76),(3.45,0.0,-0.96),(3.72,0.0,-0.99),(4.0,0.0,-0.85),(4.28,0.0,-0.57),(-4.83,0.0,-0.73),(-4.55,0.0,-0.73),(-4.28,0.0,-0.73),(-4.0,0.0,-0.73),(-3.72,0.0,-0.38),(-3.45,0.0,0.03),(-3.17,0.0,0.43),(-2.9,0.0,0.76),(-2.62,0.0,0.96),(-2.34,0.0,0.99),(-2.07,0.0,0.85),(-1.79,0.0,0.57),(-1.52,0.0,0.18),(-1.24,0.0,-0.23),(-0.97,0.0,-0.61),(-0.69,0.0,-0.88),(-0.41,0.0,-1.0),(-0.14,0.0,-0.94),(0.14,0.0,-0.73),(0.41,0.0,-0.39),(0.69,0.0,0.02),(0.97,0.0,0.43),(1.24,0.0,0.76),(1.52,0.0,0.96),(1.79,0.0,0.99),(2.07,0.0,0.85),(2.34,0.0,0.57),(2.62,0.0,0.19),(2.9,0.0,-0.23),(3.17,0.0,-0.6),(3.45,0.0,-0.88),(3.72,0.0,-1.0),(4.0,0.0,-0.94),(4.28,0.0,-0.73),(-4.83,0.0,-0.86),(-4.55,0.0,-0.86),(-4.28,0.0,-0.86),(-4.0,0.0,-0.86),(-3.72,0.0,-0.57),(-3.45,0.0,-0.19),(-3.17,0.0,0.23),(-2.9,0.0,0.6),(-2.62,0.0,0.88),(-2.34,0.0,1.0),(-2.07,0.0,0.95),(-1.79,0.0,0.73),(-1.52,0.0,0.39),(-1.24,0.0,-0.02),(-0.97,0.0,-0.42),(-0.69,0.0,-0.75),(-0.41,0.0,-0.96),(-0.14,0.0,-0.99),(0.14,0.0,-0.86),(0.41,0.0,-0.57),(0.69,0.0,-0.19),(0.97,0.0,0.22),(1.24,0.0,0.6),(1.52,0.0,0.87),(1.79,0.0,1.0),(2.07,0.0,0.95),(2.34,0.0,0.73),(2.62,0.0,0.39),(2.9,0.0,-0.01),(3.17,0.0,-0.42),(3.45,0.0,-0.75),(3.72,0.0,-0.96),(4.0,0.0,-0.99),(4.28,0.0,-0.86),(-4.83,0.0,-0.95),(-4.55,0.0,-0.95),(-4.28,0.0,-0.95),(-4.0,0.0,-0.95),(-3.72,0.0,-0.74),(-3.45,0.0,-0.4),(-3.17,0.0,0.01),(-2.9,0.0,0.42),(-2.62,0.0,0.75),(-2.34,0.0,0.95),(-2.07,0.0,0.99),(-1.79,0.0,0.86),(-1.52,0.0,0.58),(-1.24,0.0,0.2),(-0.97,0.0,-0.22),(-0.69,0.0,-0.6),(-0.41,0.0,-0.87),(-0.14,0.0,-1.0),(0.14,0.0,-0.95),(0.41,0.0,-0.74),(0.69,0.0,-0.4),(0.97,0.0,0.01),(1.24,0.0,0.41),(1.52,0.0,0.75),(1.79,0.0,0.95),(2.07,0.0,0.99),(2.34,0.0,0.86),(2.62,0.0,0.58),(2.9,0.0,0.2),(3.17,0.0,-0.21),(3.45,0.0,-0.59),(3.72,0.0,-0.87),(4.0,0.0,-1.0),(4.28,0.0,-0.95),(-4.83,0.0,-0.99),(-4.55,0.0,-0.99),(-4.28,0.0,-0.99),(-4.0,0.0,-0.99),(-3.72,0.0,-0.86),(-3.45,0.0,-0.58),(-3.17,0.0,-0.2),(-2.9,0.0,0.21),(-2.62,0.0,0.59),(-2.34,0.0,0.87),(-2.07,0.0,0.99),(-1.79,0.0,0.95),(-1.52,0.0,0.74),(-1.24,0.0,0.4),(-0.97,0.0,0.0),(-0.69,0.0,-0.41),(-0.41,0.0,-0.74),(-0.14,0.0,-0.95),(0.14,0.0,-0.99),(0.41,0.0,-0.87),(0.69,0.0,-0.59),(0.97,0.0,-0.21),(1.24,0.0,0.21),(1.52,0.0,0.59),(1.79,0.0,0.87),(2.07,0.0,0.99),(2.34,0.0,0.95),(2.62,0.0,0.74),(2.9,0.0,0.41),(3.17,0.0,0.0),(3.45,0.0,-0.41),(3.72,0.0,-0.74),(4.0,0.0,-0.95),(4.28,0.0,-0.99),(-4.83,0.0,-0.99),(-4.55,0.0,-0.99),(-4.28,0.0,-0.99),(-4.0,0.0,-0.99),(-3.72,0.0,-0.95),(-3.45,0.0,-0.74),(-3.17,0.0,-0.41),(-2.9,0.0,0.0),(-2.62,0.0,0.4),(-2.34,0.0,0.74),(-2.07,0.0,0.95),(-1.79,0.0,0.99),(-1.52,0.0,0.87),(-1.24,0.0,0.59),(-0.97,0.0,0.21),(-0.69,0.0,-0.2),(-0.41,0.0,-0.58),(-0.14,0.0,-0.86),(0.14,0.0,-0.99),(0.41,0.0,-0.95),(0.69,0.0,-0.75),(0.97,0.0,-0.41),(1.24,0.0,-0.01),(1.52,0.0,0.4),(1.79,0.0,0.74),(2.07,0.0,0.95),(2.34,0.0,1.0),(2.62,0.0,0.87),(2.9,0.0,0.59),(3.17,0.0,0.22),(3.45,0.0,-0.2),(3.72,0.0,-0.58),(4.0,0.0,-0.86),(4.28,0.0,-0.99),(-4.83,0.0,-0.95),(-4.55,0.0,-0.95),(-4.28,0.0,-0.95),(-4.0,0.0,-0.95),(-3.72,0.0,-1.0),(-3.45,0.0,-0.87),(-3.17,0.0,-0.6),(-2.9,0.0,-0.22),(-2.62,0.0,0.2),(-2.34,0.0,0.58),(-2.07,0.0,0.86),(-1.79,0.0,0.99),(-1.52,0.0,0.95),(-1.24,0.0,0.75),(-0.97,0.0,0.42),(-0.69,0.0,0.01),(-0.41,0.0,-0.4),(-0.14,0.0,-0.74),(0.14,0.0,-0.95),(0.41,0.0,-1.0),(0.69,0.0,-0.87),(0.97,0.0,-0.6),(1.24,0.0,-0.22),(1.52,0.0,0.19),(1.79,0.0,0.58),(2.07,0.0,0.86),(2.34,0.0,0.99),(2.62,0.0,0.96),(2.9,0.0,0.75),(3.17,0.0,0.42),(3.45,0.0,0.01),(3.72,0.0,-0.39),(4.0,0.0,-0.73),(4.28,0.0,-0.95),(-4.83,0.0,-0.86),(-4.55,0.0,-0.86),(-4.28,0.0,-0.86),(-4.0,0.0,-0.86),(-3.72,0.0,-0.99),(-3.45,0.0,-0.96),(-3.17,0.0,-0.75),(-2.9,0.0,-0.42),(-2.62,0.0,-0.02),(-2.34,0.0,0.39),(-2.07,0.0,0.73),(-1.79,0.0,0.95),(-1.52,0.0,1.0),(-1.24,0.0,0.88),(-0.97,0.0,0.6),(-0.69,0.0,0.23),(-0.41,0.0,-0.19),(-0.14,0.0,-0.57),(0.14,0.0,-0.86),(0.41,0.0,-0.99),(0.69,0.0,-0.96),(0.97,0.0,-0.76),(1.24,0.0,-0.43),(1.52,0.0,-0.02),(1.79,0.0,0.39),(2.07,0.0,0.73),(2.34,0.0,0.94),(2.62,0.0,1.0),(2.9,0.0,0.88),(3.17,0.0,0.61),(3.45,0.0,0.23),(3.72,0.0,-0.19),(4.0,0.0,-0.57),(4.28,0.0,-0.85),(-4.83,0.0,-0.73),(-4.55,0.0,-0.73),(-4.28,0.0,-0.73),(-4.0,0.0,-0.73),(-3.72,0.0,-0.94),(-3.45,0.0,-1.0),(-3.17,0.0,-0.88),(-2.9,0.0,-0.61),(-2.62,0.0,-0.23),(-2.34,0.0,0.18),(-2.07,0.0,0.57),(-1.79,0.0,0.85),(-1.52,0.0,0.99),(-1.24,0.0,0.96),(-0.97,0.0,0.76),(-0.69,0.0,0.43),(-0.41,0.0,0.03),(-0.14,0.0,-0.38),(0.14,0.0,-0.73),(0.41,0.0,-0.94),(0.69,0.0,-1.0),(0.97,0.0,-0.88),(1.24,0.0,-0.61),(1.52,0.0,-0.23),(1.79,0.0,0.18),(2.07,0.0,0.56),(2.34,0.0,0.85),(2.62,0.0,0.99),(2.9,0.0,0.96),(3.17,0.0,0.76),(3.45,0.0,0.43),(3.72,0.0,0.03),(4.0,0.0,-0.38),(4.28,0.0,-0.72),(-4.83,0.0,-0.56),(-4.55,0.0,-0.56),(-4.28,0.0,-0.56),(-4.0,0.0,-0.56),(-3.72,0.0,-0.85),(-3.45,0.0,-0.99),(-3.17,0.0,-0.96),(-2.9,0.0,-0.76),(-2.62,0.0,-0.44),(-2.34,0.0,-0.03),(-2.07,0.0,0.38),(-1.79,0.0,0.72),(-1.52,0.0,0.94),(-1.24,0.0,1.0),(-0.97,0.0,0.88),(-0.69,0.0,0.61),(-0.41,0.0,0.24),(-0.14,0.0,-0.18),(0.14,0.0,-0.56),(0.41,0.0,-0.85),(0.69,0.0,-0.99),(0.97,0.0,-0.96),(1.24,0.0,-0.77),(1.52,0.0,-0.44),(1.79,0.0,-0.03),(2.07,0.0,0.37),(2.34,0.0,0.72),(2.62,0.0,0.94),(2.9,0.0,1.0),(3.17,0.0,0.88),(3.45,0.0,0.62),(3.72,0.0,0.24),(4.0,0.0,-0.17),(4.28,0.0,-0.56),(-4.83,0.0,-0.37),(-4.55,0.0,-0.37),(-4.28,0.0,-0.37),(-4.0,0.0,-0.37),(-3.72,0.0,-0.72),(-3.45,0.0,-0.94),(-3.17,0.0,-1.0),(-2.9,0.0,-0.88),(-2.62,0.0,-0.62),(-2.34,0.0,-0.25),(-2.07,0.0,0.17),(-1.79,0.0,0.56),(-1.52,0.0,0.85),(-1.24,0.0,0.99),(-0.97,0.0,0.96),(-0.69,0.0,0.77),(-0.41,0.0,0.44),(-0.14,0.0,0.04),(0.14,0.0,-0.37),(0.41,0.0,-0.72),(0.69,0.0,-0.94),(0.97,0.0,-1.0),(1.24,0.0,-0.89),(1.52,0.0,-0.62),(1.79,0.0,-0.25),(2.07,0.0,0.17),(2.34,0.0,0.55),(2.62,0.0,0.84),(2.9,0.0,0.99),(3.17,0.0,0.96),(3.45,0.0,0.77),(3.72,0.0,0.45),(4.0,0.0,0.04),(4.28,0.0,-0.37),(-4.83,0.0,-0.16),(-4.55,0.0,-0.16),(-4.28,0.0,-0.16),(-4.0,0.0,-0.16),(-3.72,0.0,-0.55),(-3.45,0.0,-0.84),(-3.17,0.0,-0.99),(-2.9,0.0,-0.96),(-2.62,0.0,-0.77),(-2.34,0.0,-0.45),(-2.07,0.0,-0.05),(-1.79,0.0,0.36),(-1.52,0.0,0.71),(-1.24,0.0,0.94),(-0.97,0.0,1.0),(-0.69,0.0,0.89),(-0.41,0.0,0.63),(-0.14,0.0,0.25),(0.14,0.0,-0.16),(0.41,0.0,-0.55),(0.69,0.0,-0.84),(0.97,0.0,-0.99),(1.24,0.0,-0.96),(1.52,0.0,-0.77),(1.79,0.0,-0.45),(2.07,0.0,-0.05),(2.34,0.0,0.36),(2.62,0.0,0.71),(2.9,0.0,0.93),(3.17,0.0,1.0),(3.45,0.0,0.89),(3.72,0.0,0.63),(4.0,0.0,0.26),(4.28,0.0,-0.16),(-4.83,0.0,0.05),(-4.55,0.0,0.05),(-4.28,0.0,0.05),(-4.0,0.0,0.05),(-3.72,0.0,-0.36),(-3.45,0.0,-0.71),(-3.17,0.0,-0.93),(-2.9,0.0,-1.0),(-2.62,0.0,-0.89),(-2.34,0.0,-0.63),(-2.07,0.0,-0.26),(-1.79,0.0,0.16),(-1.52,0.0,0.54),(-1.24,0.0,0.84),(-0.97,0.0,0.99),(-0.69,0.0,0.97),(-0.41,0.0,0.78),(-0.14,0.0,0.46),(0.14,0.0,0.05),(0.41,0.0,-0.36),(0.69,0.0,-0.7),(0.97,0.0,-0.93),(1.24,0.0,-1.0),(1.52,0.0,-0.89),(1.79,0.0,-0.63),(2.07,0.0,-0.26),(2.34,0.0,0.15),(2.62,0.0,0.54),(2.9,0.0,0.84),(3.17,0.0,0.99),(3.45,0.0,0.97),(3.72,0.0,0.78),(4.0,0.0,0.46),(4.28,0.0,0.06),(-4.83,0.0,0.27),(-4.55,0.0,0.27),(-4.28,0.0,0.27),(-4.0,0.0,0.27),(-3.72,0.0,-0.15),(-3.45,0.0,-0.54),(-3.17,0.0,-0.83),(-2.9,0.0,-0.99),(-2.62,0.0,-0.97),(-2.34,0.0,-0.78),(-2.07,0.0,-0.46),(-1.79,0.0,-0.06),(-1.52,0.0,0.35),(-1.24,0.0,0.7),(-0.97,0.0,0.93),(-0.69,0.0,1.0),(-0.41,0.0,0.9),(-0.14,0.0,0.64),(0.14,0.0,0.27),(0.41,0.0,-0.15),(0.69,0.0,-0.54),(0.97,0.0,-0.83),(1.24,0.0,-0.99),(1.52,0.0,-0.97),(1.79,0.0,-0.78),(2.07,0.0,-0.46),(2.34,0.0,-0.06),(2.62,0.0,0.35),(2.9,0.0,0.7),(3.17,0.0,0.93),(3.45,0.0,1.0),(3.72,0.0,0.9),(4.0,0.0,0.64),(4.28,0.0,0.27),(-4.83,0.0,0.47),(-4.55,0.0,0.47),(-4.28,0.0,0.47),(-4.0,0.0,0.47),(-3.72,0.0,0.07),(-3.45,0.0,-0.35),(-3.17,0.0,-0.7),(-2.9,0.0,-0.93),(-2.62,0.0,-1.0),(-2.34,0.0,-0.9),(-2.07,0.0,-0.64),(-1.79,0.0,-0.27),(-1.52,0.0,0.14),(-1.24,0.0,0.53),(-0.97,0.0,0.83),(-0.69,0.0,0.99),(-0.41,0.0,0.97),(-0.14,0.0,0.79),(0.14,0.0,0.47),(0.41,0.0,0.07),(0.69,0.0,-0.34),(0.97,0.0,-0.69),(1.24,0.0,-0.93),(1.52,0.0,-1.0),(1.79,0.0,-0.9),(2.07,0.0,-0.64),(2.34,0.0,-0.28),(2.62,0.0,0.14),(2.9,0.0,0.53),(3.17,0.0,0.83),(3.45,0.0,0.98),(3.72,0.0,0.97),(4.0,0.0,0.79),(4.28,0.0,0.47),(-4.83,0.0,0.65),(-4.55,0.0,0.65),(-4.28,0.0,0.65),(-4.0,0.0,0.65),(-3.72,0.0,0.28),(-3.45,0.0,-0.14),(-3.17,0.0,-0.53),(-2.9,0.0,-0.83),(-2.62,0.0,-0.98),(-2.34,0.0,-0.97),(-2.07,0.0,-0.79),(-1.79,0.0,-0.47),(-1.52,0.0,-0.07),(-1.24,0.0,0.34),(-0.97,0.0,0.69),(-0.69,0.0,0.92),(-0.41,0.0,1.0),(-0.14,0.0,0.9),(0.14,0.0,0.65),(0.41,0.0,0.28),(0.69,0.0,-0.13),(0.97,0.0,-0.52),(1.24,0.0,-0.82),(1.52,0.0,-0.98),(1.79,0.0,-0.97),(2.07,0.0,-0.79),(2.34,0.0,-0.48),(2.62,0.0,-0.08),(2.9,0.0,0.33),(3.17,0.0,0.69),(3.45,0.0,0.92),(3.72,0.0,1.0),(4.0,0.0,0.9),(4.28,0.0,0.65),(-4.83,0.0,0.79),(-4.55,0.0,0.79),(-4.28,0.0,0.79),(-4.0,0.0,0.79),(-3.72,0.0,0.48),(-3.45,0.0,0.08),(-3.17,0.0,-0.33),(-2.9,0.0,-0.69),(-2.62,0.0,-0.92),(-2.34,0.0,-1.0),(-2.07,0.0,-0.9),(-1.79,0.0,-0.65),(-1.52,0.0,-0.29),(-1.24,0.0,0.13),(-0.97,0.0,0.52),(-0.69,0.0,0.82),(-0.41,0.0,0.98),(-0.14,0.0,0.97),(0.14,0.0,0.8),(0.41,0.0,0.48),(0.69,0.0,0.08),(0.97,0.0,-0.33),(1.24,0.0,-0.68),(1.52,0.0,-0.92),(1.79,0.0,-1.0),(2.07,0.0,-0.91),(2.34,0.0,-0.65),(2.62,0.0,-0.29),(2.9,0.0,0.12),(3.17,0.0,0.52),(3.45,0.0,0.82),(3.72,0.0,0.98),(4.0,0.0,0.97),(4.28,0.0,0.8),(-4.83,0.0,0.91),(-4.55,0.0,0.91),(-4.28,0.0,0.91),(-4.0,0.0,0.91),(-3.72,0.0,0.66),(-3.45,0.0,0.29),(-3.17,0.0,-0.12),(-2.9,0.0,-0.51),(-2.62,0.0,-0.82),(-2.34,0.0,-0.98),(-2.07,0.0,-0.97),(-1.79,0.0,-0.8),(-1.52,0.0,-0.49),(-1.24,0.0,-0.09),(-0.97,0.0,0.32),(-0.69,0.0,0.68),(-0.41,0.0,0.92),(-0.14,0.0,1.0),(0.14,0.0,0.91),(0.41,0.0,0.66),(0.69,0.0,0.3),(0.97,0.0,-0.12),(1.24,0.0,-0.51),(1.52,0.0,-0.82),(1.79,0.0,-0.98),(2.07,0.0,-0.98),(2.34,0.0,-0.8),(2.62,0.0,-0.49),(2.9,0.0,-0.09),(3.17,0.0,0.32),(3.45,0.0,0.68),(3.72,0.0,0.92),(4.0,0.0,1.0),(4.28,0.0,0.91),(-4.83,0.0,0.98),(-4.55,0.0,0.98),(-4.28,0.0,0.98),(-4.0,0.0,0.98),(-3.72,0.0,0.8),(-3.45,0.0,0.49),(-3.17,0.0,0.09),(-2.9,0.0,-0.32),(-2.62,0.0,-0.68),(-2.34,0.0,-0.92),(-2.07,0.0,-1.0),(-1.79,0.0,-0.91),(-1.52,0.0,-0.66),(-1.24,0.0,-0.3),(-0.97,0.0,0.11),(-0.69,0.0,0.51),(-0.41,0.0,0.81),(-0.14,0.0,0.98),(0.14,0.0,0.98),(0.41,0.0,0.8),(0.69,0.0,0.49),(0.97,0.0,0.1),(1.24,0.0,-0.31),(1.52,0.0,-0.67),(1.79,0.0,-0.92),(2.07,0.0,-1.0),(2.34,0.0,-0.91),(2.62,0.0,-0.67),(2.9,0.0,-0.3),(3.17,0.0,0.11),(3.45,0.0,0.5),(3.72,0.0,0.81),(4.0,0.0,0.98),(4.28,0.0,0.98),(-4.83,0.0,1.0),(-4.55,0.0,1.0),(-4.28,0.0,1.0),(-4.0,0.0,1.0),(-3.72,0.0,0.91),(-3.45,0.0,0.67),(-3.17,0.0,0.31),(-2.9,0.0,-0.11),(-2.62,0.0,-0.5),(-2.34,0.0,-0.81),(-2.07,0.0,-0.98),(-1.79,0.0,-0.98),(-1.52,0.0,-0.81),(-1.24,0.0,-0.5),(-0.97,0.0,-0.1),(-0.69,0.0,0.31),(-0.41,0.0,0.67),(-0.14,0.0,0.91),(0.14,0.0,1.0),(0.41,0.0,0.91),(0.69,0.0,0.67),(0.97,0.0,0.31),(1.24,0.0,-0.1),(1.52,0.0,-0.5),(1.79,0.0,-0.81),(2.07,0.0,-0.98),(2.34,0.0,-0.98),(2.62,0.0,-0.81),(2.9,0.0,-0.5),(3.17,0.0,-0.11),(3.45,0.0,0.31),(3.72,0.0,0.67),(4.0,0.0,0.91),(4.28,0.0,1.0)]),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='SnakeWiggle'),
    ROUTE(fromField='value_changed',fromNode='SnakeWiggle',toField='set_spine',toNode='Snake')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for Snake.py:')
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

print("python Snake.py load and self-test diagnostics complete.")