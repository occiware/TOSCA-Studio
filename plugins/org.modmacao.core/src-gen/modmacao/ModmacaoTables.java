/*******************************************************************************
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.modmacao.core/model/modmacao.ecore
 * using:
 *   /org.modmacao.core/model/modmacao.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package modmacao;

import modmacao.ModmacaoTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * ModmacaoTables provides the dispatch tables for the modmacao for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ModmacaoTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ModmacaoPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_modmacao_org_s_modmacao_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.modmacao.org/modmacao/ecore", null, modmacao.ModmacaoPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_modmacao_org_s_occi_s_platform_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.modmacao.org/occi/platform/ecore", null, org.modmacao.occi.platform.PlatformPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_modmacao_org_s_placement_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.modmacao.org/placement/ecore", null, org.modmacao.placement.PlacementPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Application = modmacao.ModmacaoTables.PACKid_http_c_s_s_schemas_modmacao_org_s_modmacao_s_ecore.getClassId("Application", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Application_0 = modmacao.ModmacaoTables.PACKid_http_c_s_s_schemas_modmacao_org_s_occi_s_platform_s_ecore.getClassId("Application", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = modmacao.ModmacaoTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Component = modmacao.ModmacaoTables.PACKid_http_c_s_s_schemas_modmacao_org_s_occi_s_platform_s_ecore.getClassId("Component", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Component_0 = modmacao.ModmacaoTables.PACKid_http_c_s_s_schemas_modmacao_org_s_modmacao_s_ecore.getClassId("Component", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Componentlink = modmacao.ModmacaoTables.PACKid_http_c_s_s_schemas_modmacao_org_s_occi_s_platform_s_ecore.getClassId("Componentlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Dependency = modmacao.ModmacaoTables.PACKid_http_c_s_s_schemas_modmacao_org_s_modmacao_s_ecore.getClassId("Dependency", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = modmacao.ModmacaoTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Link = modmacao.ModmacaoTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Link", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Placementlink = modmacao.ModmacaoTables.PACKid_http_c_s_s_schemas_modmacao_org_s_placement_s_ecore.getClassId("Placementlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = modmacao.ModmacaoTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Version = modmacao.ModmacaoTables.PACKid_http_c_s_s_schemas_modmacao_org_s_modmacao_s_ecore.getDataTypeId("Version", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_1 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ java.lang.String STR_Application_c_c_OneOrMoreComponents = "Application::OneOrMoreComponents";
	public static final /*@NonInvalid*/ java.lang.String STR_Application_c_c_appliesConstraint = "Application::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Component_c_c_OnlyOnePlacementLink = "Component::OnlyOnePlacementLink";
	public static final /*@NonInvalid*/ java.lang.String STR_Component_c_c_appliesConstraint = "Component::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Dependency_c_c_SourceMustBeComponent = "Dependency::SourceMustBeComponent";
	public static final /*@NonInvalid*/ java.lang.String STR_Dependency_c_c_TargetMustBeComponent = "Dependency::TargetMustBeComponent";
	public static final /*@NonInvalid*/ java.lang.String STR_Dependency_c_c_appliesConstraint = "Dependency::appliesConstraint";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Link = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(modmacao.ModmacaoTables.CLSSid_Link);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Resource = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(modmacao.ModmacaoTables.CLSSid_Resource);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ModmacaoTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModmacaoTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Application = new EcoreExecutorType(ModmacaoPackage.Literals.APPLICATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cluster = new EcoreExecutorType(ModmacaoPackage.Literals.CLUSTER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Component = new EcoreExecutorType(ModmacaoPackage.Literals.COMPONENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Dependency = new EcoreExecutorType(ModmacaoPackage.Literals.DEPENDENCY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Executiondependency = new EcoreExecutorType(ModmacaoPackage.Literals.EXECUTIONDEPENDENCY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Installationdependency = new EcoreExecutorType(ModmacaoPackage.Literals.INSTALLATIONDEPENDENCY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Port = new EcoreExecutorType("Port", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Version = new EcoreExecutorType("Version", PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Application,
			_Cluster,
			_Component,
			_Dependency,
			_Executiondependency,
			_Installationdependency,
			_Port,
			_Version
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModmacaoTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Application__Application = new ExecutorFragment(Types._Application, ModmacaoTables.Types._Application);
		private static final /*@NonNull*/ ExecutorFragment _Application__MixinBase = new ExecutorFragment(Types._Application, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Application__OclAny = new ExecutorFragment(Types._Application, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Application__OclElement = new ExecutorFragment(Types._Application, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Cluster__Application = new ExecutorFragment(Types._Cluster, ModmacaoTables.Types._Application);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__Cluster = new ExecutorFragment(Types._Cluster, ModmacaoTables.Types._Cluster);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__MixinBase = new ExecutorFragment(Types._Cluster, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__OclAny = new ExecutorFragment(Types._Cluster, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cluster__OclElement = new ExecutorFragment(Types._Cluster, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Component__Component = new ExecutorFragment(Types._Component, ModmacaoTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Component__MixinBase = new ExecutorFragment(Types._Component, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Component__OclAny = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Component__OclElement = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Dependency__Dependency = new ExecutorFragment(Types._Dependency, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Dependency__MixinBase = new ExecutorFragment(Types._Dependency, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Dependency__OclAny = new ExecutorFragment(Types._Dependency, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Dependency__OclElement = new ExecutorFragment(Types._Dependency, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Executiondependency__Dependency = new ExecutorFragment(Types._Executiondependency, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Executiondependency__Executiondependency = new ExecutorFragment(Types._Executiondependency, ModmacaoTables.Types._Executiondependency);
		private static final /*@NonNull*/ ExecutorFragment _Executiondependency__MixinBase = new ExecutorFragment(Types._Executiondependency, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Executiondependency__OclAny = new ExecutorFragment(Types._Executiondependency, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Executiondependency__OclElement = new ExecutorFragment(Types._Executiondependency, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Installationdependency__Dependency = new ExecutorFragment(Types._Installationdependency, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Installationdependency__Installationdependency = new ExecutorFragment(Types._Installationdependency, ModmacaoTables.Types._Installationdependency);
		private static final /*@NonNull*/ ExecutorFragment _Installationdependency__MixinBase = new ExecutorFragment(Types._Installationdependency, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Installationdependency__OclAny = new ExecutorFragment(Types._Installationdependency, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Installationdependency__OclElement = new ExecutorFragment(Types._Installationdependency, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Port__OclAny = new ExecutorFragment(Types._Port, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Port__Port = new ExecutorFragment(Types._Port, ModmacaoTables.Types._Port);

		private static final /*@NonNull*/ ExecutorFragment _Version__OclAny = new ExecutorFragment(Types._Version, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Version__Version = new ExecutorFragment(Types._Version, ModmacaoTables.Types._Version);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModmacaoTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModmacaoTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModmacaoTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final /*@NonNull*/ ExecutorProperty _Component__modmacaoComponentVersion = new EcoreExecutorProperty(ModmacaoPackage.Literals.COMPONENT__MODMACAO_COMPONENT_VERSION, Types._Component, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModmacaoTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Application =
			{
				Fragments._Application__OclAny /* 0 */,
				Fragments._Application__OclElement /* 1 */,
				Fragments._Application__MixinBase /* 2 */,
				Fragments._Application__Application /* 3 */
			};
		private static final int /*@NonNull*/ [] __Application = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cluster =
			{
				Fragments._Cluster__OclAny /* 0 */,
				Fragments._Cluster__OclElement /* 1 */,
				Fragments._Cluster__MixinBase /* 2 */,
				Fragments._Cluster__Application /* 3 */,
				Fragments._Cluster__Cluster /* 4 */
			};
		private static final int /*@NonNull*/ [] __Cluster = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Component =
			{
				Fragments._Component__OclAny /* 0 */,
				Fragments._Component__OclElement /* 1 */,
				Fragments._Component__MixinBase /* 2 */,
				Fragments._Component__Component /* 3 */
			};
		private static final int /*@NonNull*/ [] __Component = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Dependency =
			{
				Fragments._Dependency__OclAny /* 0 */,
				Fragments._Dependency__OclElement /* 1 */,
				Fragments._Dependency__MixinBase /* 2 */,
				Fragments._Dependency__Dependency /* 3 */
			};
		private static final int /*@NonNull*/ [] __Dependency = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Executiondependency =
			{
				Fragments._Executiondependency__OclAny /* 0 */,
				Fragments._Executiondependency__OclElement /* 1 */,
				Fragments._Executiondependency__MixinBase /* 2 */,
				Fragments._Executiondependency__Dependency /* 3 */,
				Fragments._Executiondependency__Executiondependency /* 4 */
			};
		private static final int /*@NonNull*/ [] __Executiondependency = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Installationdependency =
			{
				Fragments._Installationdependency__OclAny /* 0 */,
				Fragments._Installationdependency__OclElement /* 1 */,
				Fragments._Installationdependency__MixinBase /* 2 */,
				Fragments._Installationdependency__Dependency /* 3 */,
				Fragments._Installationdependency__Installationdependency /* 4 */
			};
		private static final int /*@NonNull*/ [] __Installationdependency = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Port =
			{
				Fragments._Port__OclAny /* 0 */,
				Fragments._Port__Port /* 1 */
			};
		private static final int /*@NonNull*/ [] __Port = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Version =
			{
				Fragments._Version__OclAny /* 0 */,
				Fragments._Version__Version /* 1 */
			};
		private static final int /*@NonNull*/ [] __Version = { 1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Application.initFragments(_Application, __Application);
			Types._Cluster.initFragments(_Cluster, __Cluster);
			Types._Component.initFragments(_Component, __Component);
			Types._Dependency.initFragments(_Dependency, __Dependency);
			Types._Executiondependency.initFragments(_Executiondependency, __Executiondependency);
			Types._Installationdependency.initFragments(_Installationdependency, __Installationdependency);
			Types._Port.initFragments(_Port, __Port);
			Types._Version.initFragments(_Version, __Version);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModmacaoTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__Application = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__Cluster = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__Application = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cluster__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dependency__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dependency__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dependency__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Dependency__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Executiondependency__Executiondependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Executiondependency__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Executiondependency__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Executiondependency__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Executiondependency__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Installationdependency__Installationdependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Installationdependency__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Installationdependency__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Installationdependency__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Installationdependency__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Port__Port = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Port__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Version__Version = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Version__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Application__Application.initOperations(_Application__Application);
			Fragments._Application__MixinBase.initOperations(_Application__MixinBase);
			Fragments._Application__OclAny.initOperations(_Application__OclAny);
			Fragments._Application__OclElement.initOperations(_Application__OclElement);

			Fragments._Cluster__Application.initOperations(_Cluster__Application);
			Fragments._Cluster__Cluster.initOperations(_Cluster__Cluster);
			Fragments._Cluster__MixinBase.initOperations(_Cluster__MixinBase);
			Fragments._Cluster__OclAny.initOperations(_Cluster__OclAny);
			Fragments._Cluster__OclElement.initOperations(_Cluster__OclElement);

			Fragments._Component__Component.initOperations(_Component__Component);
			Fragments._Component__MixinBase.initOperations(_Component__MixinBase);
			Fragments._Component__OclAny.initOperations(_Component__OclAny);
			Fragments._Component__OclElement.initOperations(_Component__OclElement);

			Fragments._Dependency__Dependency.initOperations(_Dependency__Dependency);
			Fragments._Dependency__MixinBase.initOperations(_Dependency__MixinBase);
			Fragments._Dependency__OclAny.initOperations(_Dependency__OclAny);
			Fragments._Dependency__OclElement.initOperations(_Dependency__OclElement);

			Fragments._Executiondependency__Dependency.initOperations(_Executiondependency__Dependency);
			Fragments._Executiondependency__Executiondependency.initOperations(_Executiondependency__Executiondependency);
			Fragments._Executiondependency__MixinBase.initOperations(_Executiondependency__MixinBase);
			Fragments._Executiondependency__OclAny.initOperations(_Executiondependency__OclAny);
			Fragments._Executiondependency__OclElement.initOperations(_Executiondependency__OclElement);

			Fragments._Installationdependency__Dependency.initOperations(_Installationdependency__Dependency);
			Fragments._Installationdependency__Installationdependency.initOperations(_Installationdependency__Installationdependency);
			Fragments._Installationdependency__MixinBase.initOperations(_Installationdependency__MixinBase);
			Fragments._Installationdependency__OclAny.initOperations(_Installationdependency__OclAny);
			Fragments._Installationdependency__OclElement.initOperations(_Installationdependency__OclElement);

			Fragments._Port__OclAny.initOperations(_Port__OclAny);
			Fragments._Port__Port.initOperations(_Port__Port);

			Fragments._Version__OclAny.initOperations(_Version__OclAny);
			Fragments._Version__Version.initOperations(_Version__Version);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModmacaoTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Application = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cluster = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Component = {
			ModmacaoTables.Properties._Component__modmacaoComponentVersion
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Dependency = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Executiondependency = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Installationdependency = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Port = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Version = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Application__Application.initProperties(_Application);
			Fragments._Cluster__Cluster.initProperties(_Cluster);
			Fragments._Component__Component.initProperties(_Component);
			Fragments._Dependency__Dependency.initProperties(_Dependency);
			Fragments._Executiondependency__Executiondependency.initProperties(_Executiondependency);
			Fragments._Installationdependency__Installationdependency.initProperties(_Installationdependency);
			Fragments._Port__Port.initProperties(_Port);
			Fragments._Version__Version.initProperties(_Version);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModmacaoTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ModmacaoTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
