# Bindings for com.amazonaws.util

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.util "1.0.0"]
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

- enum **com.amazonaws.util.AWSRequestMetrics$Field**
- class **com.amazonaws.util.AWSRequestMetrics**
- class **com.amazonaws.util.AWSRequestMetricsFullSupport**
- enum **com.amazonaws.util.AWSServiceMetrics**
- enum **com.amazonaws.util.AwsClientSideMonitoringMetrics**
- class **com.amazonaws.util.AwsHostNameUtils**
- enum **com.amazonaws.util.Base16**
- enum **com.amazonaws.util.Base16Lower**
- enum **com.amazonaws.util.Base32**
- enum **com.amazonaws.util.Base64**
- class **com.amazonaws.util.BinaryUtils**
- class **com.amazonaws.util.CRC32ChecksumCalculatingInputStream**
- class **com.amazonaws.util.CapacityManager**
- enum **com.amazonaws.util.ClassLoaderHelper**
- enum **com.amazonaws.util.Classes**
- enum **com.amazonaws.util.CodecUtils**
- class **com.amazonaws.util.CollectionUtils**
- class **com.amazonaws.util.ComparableUtils**
- class **com.amazonaws.util.CountingInputStream**
- class **com.amazonaws.util.CredentialUtils**
- class **com.amazonaws.util.DateUtils**
- class **com.amazonaws.util.EC2MetadataUtils$IAMInfo**
- class **com.amazonaws.util.EC2MetadataUtils$IAMSecurityCredential**
- class **com.amazonaws.util.EC2MetadataUtils$InstanceInfo**
- class **com.amazonaws.util.EC2MetadataUtils$NetworkInterface**
- class **com.amazonaws.util.EC2MetadataUtils**
- interface **com.amazonaws.util.EncodingScheme**
- enum **com.amazonaws.util.EncodingSchemeEnum**
- class **com.amazonaws.util.FakeIOException**
- enum **com.amazonaws.util.IOUtils**
- class **com.amazonaws.util.IdempotentUtils**
- class **com.amazonaws.util.ImmutableMapParameter$Builder**
- class **com.amazonaws.util.ImmutableMapParameter**
- class **com.amazonaws.util.JavaVersionParser$JavaVersion**
- enum **com.amazonaws.util.JavaVersionParser$KnownJavaVersions**
- class **com.amazonaws.util.JavaVersionParser**
- enum **com.amazonaws.util.JodaTime**
- class **com.amazonaws.util.LengthCheckInputStream**
- class **com.amazonaws.util.Md5Utils**
- interface **com.amazonaws.util.MetadataCache**
- class **com.amazonaws.util.NullResponseMetadataCache**
- class **com.amazonaws.util.ResponseMetadataCache**
- class **com.amazonaws.util.TimingInfo**
- class **com.amazonaws.util.UriResourcePathUtils**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
