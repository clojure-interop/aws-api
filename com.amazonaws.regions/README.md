# Bindings for com.amazonaws.regions

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.regions "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **com.amazonaws.regions.AbstractRegionMetadataProvider**
- class **com.amazonaws.regions.AwsEnvVarOverrideRegionProvider**
- class **com.amazonaws.regions.AwsProfileRegionProvider**
- class **com.amazonaws.regions.AwsRegionProvider**
- class **com.amazonaws.regions.AwsRegionProviderChain**
- class **com.amazonaws.regions.AwsSystemPropertyRegionProvider**
- class **com.amazonaws.regions.DefaultAwsRegionProviderChain**
- class **com.amazonaws.regions.InMemoryRegionImpl**
- class **com.amazonaws.regions.InMemoryRegionsProvider**
- class **com.amazonaws.regions.InstanceMetadataRegionProvider**
- class **com.amazonaws.regions.LegacyRegionXmlLoadUtils**
- class **com.amazonaws.regions.LegacyRegionXmlMetadataBuilder**
- class **com.amazonaws.regions.Region**
- interface **com.amazonaws.regions.RegionImpl**
- class **com.amazonaws.regions.RegionMetadata**
- class **com.amazonaws.regions.RegionMetadataFactory**
- class **com.amazonaws.regions.RegionMetadataParser**
- interface **com.amazonaws.regions.RegionMetadataProvider**
- class **com.amazonaws.regions.RegionUtils**
- enum **com.amazonaws.regions.Regions**
- class **com.amazonaws.regions.ServiceAbbreviations**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
