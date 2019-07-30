(ns com.amazonaws.services.cloud9.AbstractAWSCloud9
  "Abstract implementation of AWSCloud9. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloud9 AbstractAWSCloud9]))

(defn delete-environment-membership
  "Description copied from interface: AWSCloud9

  request - `com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest`

  returns: Result of the DeleteEnvironmentMembership operation returned by the service. - `com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult`"
  (^com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult [^AbstractAWSCloud9 this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest request]
    (-> this (.deleteEnvironmentMembership request))))

(defn create-environment-ec-2
  "Description copied from interface: AWSCloud9

  request - `com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request`

  returns: Result of the CreateEnvironmentEC2 operation returned by the service. - `com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result`"
  (^com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result [^AbstractAWSCloud9 this ^com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request request]
    (-> this (.createEnvironmentEC2 request))))

(defn describe-environment-status
  "Description copied from interface: AWSCloud9

  request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest`

  returns: Result of the DescribeEnvironmentStatus operation returned by the service. - `com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult`"
  (^com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult [^AbstractAWSCloud9 this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest request]
    (-> this (.describeEnvironmentStatus request))))

(defn create-environment-membership
  "Description copied from interface: AWSCloud9

  request - `com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest`

  returns: Result of the CreateEnvironmentMembership operation returned by the service. - `com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult`"
  (^com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult [^AbstractAWSCloud9 this ^com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest request]
    (-> this (.createEnvironmentMembership request))))

(defn update-environment-membership
  "Description copied from interface: AWSCloud9

  request - `com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest`

  returns: Result of the UpdateEnvironmentMembership operation returned by the service. - `com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult`"
  (^com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult [^AbstractAWSCloud9 this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest request]
    (-> this (.updateEnvironmentMembership request))))

(defn shutdown
  "Description copied from interface: AWSCloud9"
  ([^AbstractAWSCloud9 this]
    (-> this (.shutdown))))

(defn describe-environments
  "Description copied from interface: AWSCloud9

  request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest`

  returns: Result of the DescribeEnvironments operation returned by the service. - `com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult`"
  (^com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult [^AbstractAWSCloud9 this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest request]
    (-> this (.describeEnvironments request))))

(defn list-environments
  "Description copied from interface: AWSCloud9

  request - `com.amazonaws.services.cloud9.model.ListEnvironmentsRequest`

  returns: Result of the ListEnvironments operation returned by the service. - `com.amazonaws.services.cloud9.model.ListEnvironmentsResult`"
  (^com.amazonaws.services.cloud9.model.ListEnvironmentsResult [^AbstractAWSCloud9 this ^com.amazonaws.services.cloud9.model.ListEnvironmentsRequest request]
    (-> this (.listEnvironments request))))

(defn describe-environment-memberships
  "Description copied from interface: AWSCloud9

  request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest`

  returns: Result of the DescribeEnvironmentMemberships operation returned by the service. - `com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult`"
  (^com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult [^AbstractAWSCloud9 this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest request]
    (-> this (.describeEnvironmentMemberships request))))

(defn delete-environment
  "Description copied from interface: AWSCloud9

  request - `com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest`

  returns: Result of the DeleteEnvironment operation returned by the service. - `com.amazonaws.services.cloud9.model.DeleteEnvironmentResult`"
  (^com.amazonaws.services.cloud9.model.DeleteEnvironmentResult [^AbstractAWSCloud9 this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest request]
    (-> this (.deleteEnvironment request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSCloud9

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSCloud9 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-environment
  "Description copied from interface: AWSCloud9

  request - `com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest`

  returns: Result of the UpdateEnvironment operation returned by the service. - `com.amazonaws.services.cloud9.model.UpdateEnvironmentResult`"
  (^com.amazonaws.services.cloud9.model.UpdateEnvironmentResult [^AbstractAWSCloud9 this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest request]
    (-> this (.updateEnvironment request))))

