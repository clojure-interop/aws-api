(ns com.amazonaws.auth.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[com.amazonaws.auth.AWS3Signer])
(require '[com.amazonaws.auth.AWS4Signer])
(require '[com.amazonaws.auth.AWS4UnsignedPayloadSigner])
(require '[com.amazonaws.auth.AWSCredentials])
(require '[com.amazonaws.auth.AWSCredentialsProvider])
(require '[com.amazonaws.auth.AWSCredentialsProviderChain])
(require '[com.amazonaws.auth.AWSRefreshableSessionCredentials])
(require '[com.amazonaws.auth.AWSSessionCredentials])
(require '[com.amazonaws.auth.AWSSessionCredentialsProvider])
(require '[com.amazonaws.auth.AWSStaticCredentialsProvider])
(require '[com.amazonaws.auth.AbstractAWSSigner])
(require '[com.amazonaws.auth.AnonymousAWSCredentials])
(require '[com.amazonaws.auth.AwsChunkedEncodingInputStream])
(require '[com.amazonaws.auth.BasicAWSCredentials])
(require '[com.amazonaws.auth.BasicSessionCredentials])
(require '[com.amazonaws.auth.CanHandleNullCredentials])
(require '[com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider])
(require '[com.amazonaws.auth.ContainerCredentialsProvider])
(require '[com.amazonaws.auth.DefaultAWSCredentialsProviderChain])
(require '[com.amazonaws.auth.EC2ContainerCredentialsProviderWrapper])
(require '[com.amazonaws.auth.EndpointPrefixAwareSigner])
(require '[com.amazonaws.auth.EnvironmentVariableCredentialsProvider])
(require '[com.amazonaws.auth.InstanceProfileCredentialsProvider])
(require '[com.amazonaws.auth.NoOpSigner])
(require '[com.amazonaws.auth.NoSessionSupportCredentials])
(require '[com.amazonaws.auth.PEM])
(require '[com.amazonaws.auth.PEMObject])
(require '[com.amazonaws.auth.PEMObjectType])
(require '[com.amazonaws.auth.Presigner])
(require '[com.amazonaws.auth.ProcessCredentialsProvider$Builder])
(require '[com.amazonaws.auth.ProcessCredentialsProvider])
(require '[com.amazonaws.auth.PropertiesCredentials])
(require '[com.amazonaws.auth.PropertiesFileCredentialsProvider])
(require '[com.amazonaws.auth.QueryStringSigner])
(require '[com.amazonaws.auth.RSA])
(require '[com.amazonaws.auth.RegionAwareSigner])
(require '[com.amazonaws.auth.RequestSigner])
(require '[com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder])
(require '[com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider])
(require '[com.amazonaws.auth.STSSessionCredentials])
(require '[com.amazonaws.auth.STSSessionCredentialsProvider])
(require '[com.amazonaws.auth.SdkClock$Instance])
(require '[com.amazonaws.auth.SdkClock$MockClock])
(require '[com.amazonaws.auth.SdkClock])
(require '[com.amazonaws.auth.ServiceAwareSigner])
(require '[com.amazonaws.auth.SessionCredentialsProviderFactory])
(require '[com.amazonaws.auth.SignatureVersion])
(require '[com.amazonaws.auth.Signer])
(require '[com.amazonaws.auth.SignerAsRequestSigner])
(require '[com.amazonaws.auth.SignerFactory])
(require '[com.amazonaws.auth.SignerParams])
(require '[com.amazonaws.auth.SignerTypeAware])
(require '[com.amazonaws.auth.SigningAlgorithm])
(require '[com.amazonaws.auth.StaticSignerProvider])
(require '[com.amazonaws.auth.SystemPropertiesCredentialsProvider])
(require '[com.amazonaws.auth.WebIdentityFederationSessionCredentialsProvider])