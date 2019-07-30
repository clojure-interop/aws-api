(ns com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder
  "Provides a builder pattern to avoid combinatorial explosion of the number of parameters that
  are passed to constructors. The builder introspects which parameters have been set and calls
  the appropriate constructor."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth STSAssumeRoleSessionCredentialsProvider$Builder]))

(defn ->builder
  "Constructor.

  role-arn - Required roleArn parameter used when starting a session - `java.lang.String`
  role-session-name - Required roleSessionName parameter used when starting a session - `java.lang.String`"
  (^STSAssumeRoleSessionCredentialsProvider$Builder [^java.lang.String role-arn ^java.lang.String role-session-name]
    (new STSAssumeRoleSessionCredentialsProvider$Builder role-arn role-session-name)))

(defn with-role-session-duration-seconds
  "Set the roleSessionDurationSeconds that is used when creating a new assumed role
   session.

  role-session-duration-seconds - The duration for which we want to have an assumed role session to be active. - `int`

  returns: the itself for chained calls - `com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder`"
  (^com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder [^STSAssumeRoleSessionCredentialsProvider$Builder this ^Integer role-session-duration-seconds]
    (-> this (.withRoleSessionDurationSeconds role-session-duration-seconds))))

(defn with-long-lived-credentials-provider
  "Deprecated. Supply a configured STS client via the withStsClient(AWSSecurityTokenService)
   setter. Use AWSSecurityTokenServiceClientBuilder
   to create an STS client.

  long-lived-credentials-provider - A credentials provider used to generate sessions in the assumed role - `com.amazonaws.auth.AWSCredentialsProvider`

  returns: the builder itself for chained calls - `com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder`"
  (^com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder [^STSAssumeRoleSessionCredentialsProvider$Builder this ^com.amazonaws.auth.AWSCredentialsProvider long-lived-credentials-provider]
    (-> this (.withLongLivedCredentialsProvider long-lived-credentials-provider))))

(defn with-sts-client
  "Sets a preconfigured STS client to use for the credentials provider. See AWSSecurityTokenServiceClientBuilder for an easy
   way to configure and create an STS client.

   Note: This setter is mutually exclusive to the deprecated withClientConfiguration(ClientConfiguration), withLongLivedCredentials(AWSCredentials),
   withLongLivedCredentialsProvider(AWSCredentialsProvider), and withServiceEndpoint(String) setters. Construct a fully configured STS client via the
   AWSSecurityTokenServiceClientBuilder and
   pass it to this setter.

  sts - Custom STS client to use. - `com.amazonaws.services.securitytoken.AWSSecurityTokenService`

  returns: This object for chained calls. - `com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder`"
  (^com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder [^STSAssumeRoleSessionCredentialsProvider$Builder this ^com.amazonaws.services.securitytoken.AWSSecurityTokenService sts]
    (-> this (.withStsClient sts))))

(defn with-long-lived-credentials
  "Deprecated. Supply a configured STS client via the withStsClient(AWSSecurityTokenService)
   setter. Use AWSSecurityTokenServiceClientBuilder
   to create an STS client.

  long-lived-credentials - Credentials used to generate sessions in the assumed role - `com.amazonaws.auth.AWSCredentials`

  returns: the builder itself for chained calls - `com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder`"
  (^com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder [^STSAssumeRoleSessionCredentialsProvider$Builder this ^com.amazonaws.auth.AWSCredentials long-lived-credentials]
    (-> this (.withLongLivedCredentials long-lived-credentials))))

(defn with-client-configuration
  "Deprecated. Supply a configured STS client via the withStsClient(AWSSecurityTokenService)
   setter. Use AWSSecurityTokenServiceClientBuilder
   to create an STS client.

  client-configuration - ClientConfiguration for the AWSSecurityTokenService client - `com.amazonaws.ClientConfiguration`

  returns: the builder itself for chained calls - `com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder`"
  (^com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder [^STSAssumeRoleSessionCredentialsProvider$Builder this ^com.amazonaws.ClientConfiguration client-configuration]
    (-> this (.withClientConfiguration client-configuration))))

(defn with-service-endpoint
  "Deprecated. Supply a configured STS client via the withStsClient(AWSSecurityTokenService)
   setter. Use AWSSecurityTokenServiceClientBuilder
   to create an STS client.

  service-endpoint - `java.lang.String`

  returns: `com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder`"
  (^com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder [^STSAssumeRoleSessionCredentialsProvider$Builder this ^java.lang.String service-endpoint]
    (-> this (.withServiceEndpoint service-endpoint))))

(defn build
  "Build the configured provider

  returns: the configured STSAssumeRoleSessionCredentialsProvider - `com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider`"
  (^com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider [^STSAssumeRoleSessionCredentialsProvider$Builder this]
    (-> this (.build))))

(defn with-scope-down-policy
  "An IAM policy in JSON format to scope down permissions granted from the assume role.


   This parameter is optional. If you pass a policy, the temporary security
   credentials that are returned by the operation have the permissions that
   are allowed by both (the intersection of) the access policy of the role
   that is being assumed, and the policy that you pass. This gives
   you a way to further restrict the permissions for the resulting temporary
   security credentials. You cannot use the passed policy to grant
   permissions that are in excess of those allowed by the access policy of
   the role that is being assumed. For more information, see Permissions for AssumeRole, AssumeRoleWithSAML, and
   AssumeRoleWithWebIdentity in the IAM User Guide.


   The format for this parameter, as described by its regex pattern, is a
   string of characters up to 2048 characters in length. The characters can
   be any ASCII character from the space character to the end of the valid
   character list ( -ÿ). It can also include the tab ( ), linefeed ( ),
   and carriage return ( ) characters.



   The policy plain text must be 2048 bytes or shorter. However, an internal
   conversion compresses it into a packed binary format with a separate
   limit. The PackedPolicySize response element indicates by percentage how
   close to the upper size limit the policy is, with 100% equaling the
   maximum allowed size.

  scope-down-policy - An IAM policy in JSON format. This parameter is optional. If you pass a policy, the temporary security credentials that are returned by the operation have the permissions that are allowed by both (the intersection of) the access policy of the role that is being assumed, and the policy that you pass. This gives you a way to further restrict the permissions for the resulting temporary security credentials. You cannot use the passed policy to grant permissions that are in excess of those allowed by the access policy of the role that is being assumed. For more information, see Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity in the IAM User Guide. The format for this parameter, as described by its regex pattern, is a string of characters up to 2048 characters in length. The characters can be any ASCII character from the space character to the end of the valid character list ( -ÿ). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters. The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a packed binary format with a separate limit. The PackedPolicySize response element indicates by percentage how close to the upper size limit the policy is, with 100% equaling the maximum allowed size. - `java.lang.String`

  returns: Returns a reference to this object so that method calls can be
           chained together. - `com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder`"
  (^com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder [^STSAssumeRoleSessionCredentialsProvider$Builder this ^java.lang.String scope-down-policy]
    (-> this (.withScopeDownPolicy scope-down-policy))))

(defn with-external-id
  "Set the roleExternalId parameter that is used when retrieving session credentials under
   an assumed role.

  role-external-id - An external id used in the service call used to retrieve session credentials - `java.lang.String`

  returns: the builder itself for chained calls - `com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder`"
  (^com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider$Builder [^STSAssumeRoleSessionCredentialsProvider$Builder this ^java.lang.String role-external-id]
    (-> this (.withExternalId role-external-id))))

