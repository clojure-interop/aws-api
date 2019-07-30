# Bindings for com.amazonaws.auth

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.auth "1.0.0"]
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

- class **com.amazonaws.auth.AWS3Signer**
- class **com.amazonaws.auth.AWS4Signer**
- class **com.amazonaws.auth.AWS4UnsignedPayloadSigner**
- interface **com.amazonaws.auth.AWSCredentials**
- interface **com.amazonaws.auth.AWSCredentialsProvider**
- class **com.amazonaws.auth.AWSCredentialsProviderChain**
- interface **com.amazonaws.auth.AWSRefreshableSessionCredentials**
- interface **com.amazonaws.auth.AWSSessionCredentials**
- interface **com.amazonaws.auth.AWSSessionCredentialsProvider**
- class **com.amazonaws.auth.AWSStaticCredentialsProvider**
- class **com.amazonaws.auth.AbstractAWSSigner**
- class **com.amazonaws.auth.AnonymousAWSCredentials**
- class **com.amazonaws.auth.AwsChunkedEncodingInputStream**
- class **com.amazonaws.auth.BasicAWSCredentials**
- class **com.amazonaws.auth.BasicSessionCredentials**
- interface **com.amazonaws.auth.CanHandleNullCredentials**
- class **com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider**
- class **com.amazonaws.auth.ContainerCredentialsProvider**
- class **com.amazonaws.auth.DefaultAWSCredentialsProviderChain**
- class **com.amazonaws.auth.EC2ContainerCredentialsProviderWrapper**
- interface **com.amazonaws.auth.EndpointPrefixAwareSigner**
- class **com.amazonaws.auth.EnvironmentVariableCredentialsProvider**
- class **com.amazonaws.auth.InstanceProfileCredentialsProvider**
- class **com.amazonaws.auth.NoOpSigner**
- interface **com.amazonaws.auth.NoSessionSupportCredentials**
- enum **com.amazonaws.auth.PEM**
- class **com.amazonaws.auth.PEMObject**
- enum **com.amazonaws.auth.PEMObjectType**
- interface **com.amazonaws.auth.Presigner**
- class **com.amazonaws.auth.ProcessCredentialsProvider$Builder**
- class **com.amazonaws.auth.ProcessCredentialsProvider**
- class **com.amazonaws.auth.PropertiesCredentials**
- class **com.amazonaws.auth.PropertiesFileCredentialsProvider**
- class **com.amazonaws.auth.QueryStringSigner**
- enum **com.amazonaws.auth.RSA**
- interface **com.amazonaws.auth.RegionAwareSigner**
- interface **com.amazonaws.auth.RequestSigner**
- class **com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder**
- class **com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider**
- class **com.amazonaws.auth.STSSessionCredentials**
- class **com.amazonaws.auth.STSSessionCredentialsProvider**
- class **com.amazonaws.auth.SdkClock$Instance**
- class **com.amazonaws.auth.SdkClock$MockClock**
- interface **com.amazonaws.auth.SdkClock**
- interface **com.amazonaws.auth.ServiceAwareSigner**
- class **com.amazonaws.auth.SessionCredentialsProviderFactory**
- enum **com.amazonaws.auth.SignatureVersion**
- interface **com.amazonaws.auth.Signer**
- class **com.amazonaws.auth.SignerAsRequestSigner**
- class **com.amazonaws.auth.SignerFactory**
- class **com.amazonaws.auth.SignerParams**
- interface **com.amazonaws.auth.SignerTypeAware**
- enum **com.amazonaws.auth.SigningAlgorithm**
- class **com.amazonaws.auth.StaticSignerProvider**
- class **com.amazonaws.auth.SystemPropertiesCredentialsProvider**
- class **com.amazonaws.auth.WebIdentityFederationSessionCredentialsProvider**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
