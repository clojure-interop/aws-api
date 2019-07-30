(ns com.amazonaws.services.opsworks.AbstractAWSOpsWorks
  "Abstract implementation of AWSOpsWorks. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.opsworks AbstractAWSOpsWorks]))

(defn create-app
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.CreateAppRequest`

  returns: Result of the CreateApp operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateAppResult`"
  (^com.amazonaws.services.opsworks.model.CreateAppResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.CreateAppRequest request]
    (-> this (.createApp request))))

(defn describe-stack-provisioning-parameters
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest`

  returns: Result of the DescribeStackProvisioningParameters operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult`"
  (^com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest request]
    (-> this (.describeStackProvisioningParameters request))))

(defn update-layer
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.UpdateLayerRequest`

  returns: Result of the UpdateLayer operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateLayerResult`"
  (^com.amazonaws.services.opsworks.model.UpdateLayerResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateLayerRequest request]
    (-> this (.updateLayer request))))

(defn describe-deployments
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest`

  returns: Result of the DescribeDeployments operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeDeploymentsResult`"
  (^com.amazonaws.services.opsworks.model.DescribeDeploymentsResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest request]
    (-> this (.describeDeployments request))))

(defn describe-stacks
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeStacksRequest`

  returns: Result of the DescribeStacks operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeStacksResult`"
  (^com.amazonaws.services.opsworks.model.DescribeStacksResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeStacksRequest request]
    (-> this (.describeStacks request))))

(defn unassign-volume
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.UnassignVolumeRequest`

  returns: Result of the UnassignVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.UnassignVolumeResult`"
  (^com.amazonaws.services.opsworks.model.UnassignVolumeResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.UnassignVolumeRequest request]
    (-> this (.unassignVolume request))))

(defn set-region
  "Description copied from interface: AWSOpsWorks

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSOpsWorks this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-layer
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.CreateLayerRequest`

  returns: Result of the CreateLayer operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateLayerResult`"
  (^com.amazonaws.services.opsworks.model.CreateLayerResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.CreateLayerRequest request]
    (-> this (.createLayer request))))

(defn describe-volumes
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeVolumesRequest`

  returns: Result of the DescribeVolumes operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeVolumesResult`"
  (^com.amazonaws.services.opsworks.model.DescribeVolumesResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeVolumesRequest request]
    (-> this (.describeVolumes request))))

(defn start-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.StartInstanceRequest`

  returns: Result of the StartInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.StartInstanceResult`"
  (^com.amazonaws.services.opsworks.model.StartInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.StartInstanceRequest request]
    (-> this (.startInstance request))))

(defn deregister-ecs-cluster
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest`

  returns: Result of the DeregisterEcsCluster operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult`"
  (^com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest request]
    (-> this (.deregisterEcsCluster request))))

(defn delete-user-profile
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DeleteUserProfileRequest`

  returns: Result of the DeleteUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteUserProfileResult`"
  (^com.amazonaws.services.opsworks.model.DeleteUserProfileResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeleteUserProfileRequest request]
    (-> this (.deleteUserProfile request))))

(defn waiters
  "returns: `com.amazonaws.services.opsworks.waiters.AWSOpsWorksWaiters`"
  (^com.amazonaws.services.opsworks.waiters.AWSOpsWorksWaiters [^AbstractAWSOpsWorks this]
    (-> this (.waiters))))

(defn update-user-profile
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.UpdateUserProfileRequest`

  returns: Result of the UpdateUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateUserProfileResult`"
  (^com.amazonaws.services.opsworks.model.UpdateUserProfileResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateUserProfileRequest request]
    (-> this (.updateUserProfile request))))

(defn describe-ecs-clusters
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest`

  returns: Result of the DescribeEcsClusters operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeEcsClustersResult`"
  (^com.amazonaws.services.opsworks.model.DescribeEcsClustersResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest request]
    (-> this (.describeEcsClusters request))))

(defn register-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.RegisterInstanceRequest`

  returns: Result of the RegisterInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterInstanceResult`"
  (^com.amazonaws.services.opsworks.model.RegisterInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.RegisterInstanceRequest request]
    (-> this (.registerInstance request))))

(defn list-tags
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.opsworks.model.ListTagsResult`"
  (^com.amazonaws.services.opsworks.model.ListTagsResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn update-stack
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.UpdateStackRequest`

  returns: Result of the UpdateStack operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateStackResult`"
  (^com.amazonaws.services.opsworks.model.UpdateStackResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateStackRequest request]
    (-> this (.updateStack request))))

(defn update-my-user-profile
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest`

  returns: Result of the UpdateMyUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult`"
  (^com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest request]
    (-> this (.updateMyUserProfile request))))

(defn describe-time-based-auto-scaling
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest`

  returns: Result of the DescribeTimeBasedAutoScaling operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult`"
  (^com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest request]
    (-> this (.describeTimeBasedAutoScaling request))))

(defn describe-my-user-profile
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest`

  returns: Result of the DescribeMyUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult`"
  (^com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest request]
    (-> this (.describeMyUserProfile request))))

(defn create-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.CreateInstanceRequest`

  returns: Result of the CreateInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateInstanceResult`"
  (^com.amazonaws.services.opsworks.model.CreateInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.CreateInstanceRequest request]
    (-> this (.createInstance request))))

(defn deregister-rds-db-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest`

  returns: Result of the DeregisterRdsDbInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult`"
  (^com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest request]
    (-> this (.deregisterRdsDbInstance request))))

(defn describe-layers
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeLayersRequest`

  returns: Result of the DescribeLayers operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeLayersResult`"
  (^com.amazonaws.services.opsworks.model.DescribeLayersResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeLayersRequest request]
    (-> this (.describeLayers request))))

(defn untag-resource
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.opsworks.model.UntagResourceResult`"
  (^com.amazonaws.services.opsworks.model.UntagResourceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn stop-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.StopInstanceRequest`

  returns: Result of the StopInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.StopInstanceResult`"
  (^com.amazonaws.services.opsworks.model.StopInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.StopInstanceRequest request]
    (-> this (.stopInstance request))))

(defn reboot-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.RebootInstanceRequest`

  returns: Result of the RebootInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.RebootInstanceResult`"
  (^com.amazonaws.services.opsworks.model.RebootInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.RebootInstanceRequest request]
    (-> this (.rebootInstance request))))

(defn update-volume
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.UpdateVolumeRequest`

  returns: Result of the UpdateVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateVolumeResult`"
  (^com.amazonaws.services.opsworks.model.UpdateVolumeResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateVolumeRequest request]
    (-> this (.updateVolume request))))

(defn describe-commands
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeCommandsRequest`

  returns: Result of the DescribeCommands operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeCommandsResult`"
  (^com.amazonaws.services.opsworks.model.DescribeCommandsResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeCommandsRequest request]
    (-> this (.describeCommands request))))

(defn disassociate-elastic-ip
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest`

  returns: Result of the DisassociateElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.DisassociateElasticIpResult`"
  (^com.amazonaws.services.opsworks.model.DisassociateElasticIpResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest request]
    (-> this (.disassociateElasticIp request))))

(defn describe-load-based-auto-scaling
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest`

  returns: Result of the DescribeLoadBasedAutoScaling operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult`"
  (^com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest request]
    (-> this (.describeLoadBasedAutoScaling request))))

(defn update-rds-db-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest`

  returns: Result of the UpdateRdsDbInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult`"
  (^com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest request]
    (-> this (.updateRdsDbInstance request))))

(defn describe-operating-systems
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest`

  returns: Result of the DescribeOperatingSystems operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult`"
  (^com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest request]
    (-> this (.describeOperatingSystems request))))

(defn attach-elastic-load-balancer
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest`

  returns: Result of the AttachElasticLoadBalancer operation returned by the service. - `com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult`"
  (^com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest request]
    (-> this (.attachElasticLoadBalancer request))))

(defn describe-elastic-ips
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest`

  returns: Result of the DescribeElasticIps operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeElasticIpsResult`"
  (^com.amazonaws.services.opsworks.model.DescribeElasticIpsResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest request]
    (-> this (.describeElasticIps request))))

(defn delete-layer
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DeleteLayerRequest`

  returns: Result of the DeleteLayer operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteLayerResult`"
  (^com.amazonaws.services.opsworks.model.DeleteLayerResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeleteLayerRequest request]
    (-> this (.deleteLayer request))))

(defn stop-stack
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.StopStackRequest`

  returns: Result of the StopStack operation returned by the service. - `com.amazonaws.services.opsworks.model.StopStackResult`"
  (^com.amazonaws.services.opsworks.model.StopStackResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.StopStackRequest request]
    (-> this (.stopStack request))))

(defn set-permission
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.SetPermissionRequest`

  returns: Result of the SetPermission operation returned by the service. - `com.amazonaws.services.opsworks.model.SetPermissionResult`"
  (^com.amazonaws.services.opsworks.model.SetPermissionResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.SetPermissionRequest request]
    (-> this (.setPermission request))))

(defn associate-elastic-ip
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.AssociateElasticIpRequest`

  returns: Result of the AssociateElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.AssociateElasticIpResult`"
  (^com.amazonaws.services.opsworks.model.AssociateElasticIpResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.AssociateElasticIpRequest request]
    (-> this (.associateElasticIp request))))

(defn assign-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.AssignInstanceRequest`

  returns: Result of the AssignInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.AssignInstanceResult`"
  (^com.amazonaws.services.opsworks.model.AssignInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.AssignInstanceRequest request]
    (-> this (.assignInstance request))))

(defn describe-stack-summary
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest`

  returns: Result of the DescribeStackSummary operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeStackSummaryResult`"
  (^com.amazonaws.services.opsworks.model.DescribeStackSummaryResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest request]
    (-> this (.describeStackSummary request))))

(defn describe-user-profiles
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest`

  returns: Result of the DescribeUserProfiles operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeUserProfilesResult`"
  (^com.amazonaws.services.opsworks.model.DescribeUserProfilesResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest request]
    (-> this (.describeUserProfiles request))))

(defn register-ecs-cluster
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest`

  returns: Result of the RegisterEcsCluster operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterEcsClusterResult`"
  (^com.amazonaws.services.opsworks.model.RegisterEcsClusterResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest request]
    (-> this (.registerEcsCluster request))))

(defn create-stack
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.CreateStackRequest`

  returns: Result of the CreateStack operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateStackResult`"
  (^com.amazonaws.services.opsworks.model.CreateStackResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.CreateStackRequest request]
    (-> this (.createStack request))))

(defn create-deployment
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateDeploymentResult`"
  (^com.amazonaws.services.opsworks.model.CreateDeploymentResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.CreateDeploymentRequest request]
    (-> this (.createDeployment request))))

(defn delete-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DeleteInstanceRequest`

  returns: Result of the DeleteInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteInstanceResult`"
  (^com.amazonaws.services.opsworks.model.DeleteInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeleteInstanceRequest request]
    (-> this (.deleteInstance request))))

(defn deregister-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DeregisterInstanceRequest`

  returns: Result of the DeregisterInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterInstanceResult`"
  (^com.amazonaws.services.opsworks.model.DeregisterInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeregisterInstanceRequest request]
    (-> this (.deregisterInstance request))))

(defn shutdown
  "Description copied from interface: AWSOpsWorks"
  ([^AbstractAWSOpsWorks this]
    (-> this (.shutdown))))

(defn clone-stack
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.CloneStackRequest`

  returns: Result of the CloneStack operation returned by the service. - `com.amazonaws.services.opsworks.model.CloneStackResult`"
  (^com.amazonaws.services.opsworks.model.CloneStackResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.CloneStackRequest request]
    (-> this (.cloneStack request))))

(defn describe-apps
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeAppsRequest`

  returns: Result of the DescribeApps operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeAppsResult`"
  (^com.amazonaws.services.opsworks.model.DescribeAppsResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeAppsRequest request]
    (-> this (.describeApps request))))

(defn register-rds-db-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest`

  returns: Result of the RegisterRdsDbInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult`"
  (^com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest request]
    (-> this (.registerRdsDbInstance request))))

(defn describe-service-errors
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest`

  returns: Result of the DescribeServiceErrors operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult`"
  (^com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest request]
    (-> this (.describeServiceErrors request))))

(defn assign-volume
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.AssignVolumeRequest`

  returns: Result of the AssignVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.AssignVolumeResult`"
  (^com.amazonaws.services.opsworks.model.AssignVolumeResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.AssignVolumeRequest request]
    (-> this (.assignVolume request))))

(defn delete-stack
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DeleteStackRequest`

  returns: Result of the DeleteStack operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteStackResult`"
  (^com.amazonaws.services.opsworks.model.DeleteStackResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeleteStackRequest request]
    (-> this (.deleteStack request))))

(defn set-endpoint
  "Description copied from interface: AWSOpsWorks

  endpoint - The endpoint (ex: \"opsworks.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://opsworks.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSOpsWorks this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn create-user-profile
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.CreateUserProfileRequest`

  returns: Result of the CreateUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateUserProfileResult`"
  (^com.amazonaws.services.opsworks.model.CreateUserProfileResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.CreateUserProfileRequest request]
    (-> this (.createUserProfile request))))

(defn describe-elastic-load-balancers
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest`

  returns: Result of the DescribeElasticLoadBalancers operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult`"
  (^com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest request]
    (-> this (.describeElasticLoadBalancers request))))

(defn update-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.UpdateInstanceRequest`

  returns: Result of the UpdateInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateInstanceResult`"
  (^com.amazonaws.services.opsworks.model.UpdateInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateInstanceRequest request]
    (-> this (.updateInstance request))))

(defn grant-access
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.GrantAccessRequest`

  returns: Result of the GrantAccess operation returned by the service. - `com.amazonaws.services.opsworks.model.GrantAccessResult`"
  (^com.amazonaws.services.opsworks.model.GrantAccessResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.GrantAccessRequest request]
    (-> this (.grantAccess request))))

(defn delete-app
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DeleteAppRequest`

  returns: Result of the DeleteApp operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteAppResult`"
  (^com.amazonaws.services.opsworks.model.DeleteAppResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeleteAppRequest request]
    (-> this (.deleteApp request))))

(defn deregister-elastic-ip
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest`

  returns: Result of the DeregisterElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterElasticIpResult`"
  (^com.amazonaws.services.opsworks.model.DeregisterElasticIpResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest request]
    (-> this (.deregisterElasticIp request))))

(defn register-elastic-ip
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.RegisterElasticIpRequest`

  returns: Result of the RegisterElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterElasticIpResult`"
  (^com.amazonaws.services.opsworks.model.RegisterElasticIpResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.RegisterElasticIpRequest request]
    (-> this (.registerElasticIp request))))

(defn deregister-volume
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DeregisterVolumeRequest`

  returns: Result of the DeregisterVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterVolumeResult`"
  (^com.amazonaws.services.opsworks.model.DeregisterVolumeResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeregisterVolumeRequest request]
    (-> this (.deregisterVolume request))))

(defn detach-elastic-load-balancer
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest`

  returns: Result of the DetachElasticLoadBalancer operation returned by the service. - `com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult`"
  (^com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest request]
    (-> this (.detachElasticLoadBalancer request))))

(defn describe-rds-db-instances
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest`

  returns: Result of the DescribeRdsDbInstances operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult`"
  (^com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest request]
    (-> this (.describeRdsDbInstances request))))

(defn describe-instances
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeInstancesRequest`

  returns: Result of the DescribeInstances operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeInstancesResult`"
  (^com.amazonaws.services.opsworks.model.DescribeInstancesResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeInstancesRequest request]
    (-> this (.describeInstances request))))

(defn describe-permissions
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribePermissionsRequest`

  returns: Result of the DescribePermissions operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribePermissionsResult`"
  (^com.amazonaws.services.opsworks.model.DescribePermissionsResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribePermissionsRequest request]
    (-> this (.describePermissions request))))

(defn describe-agent-versions
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest`

  returns: Result of the DescribeAgentVersions operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult`"
  (^com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest request]
    (-> this (.describeAgentVersions request))))

(defn start-stack
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.StartStackRequest`

  returns: Result of the StartStack operation returned by the service. - `com.amazonaws.services.opsworks.model.StartStackResult`"
  (^com.amazonaws.services.opsworks.model.StartStackResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.StartStackRequest request]
    (-> this (.startStack request))))

(defn get-hostname-suggestion
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest`

  returns: Result of the GetHostnameSuggestion operation returned by the service. - `com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult`"
  (^com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest request]
    (-> this (.getHostnameSuggestion request))))

(defn register-volume
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.RegisterVolumeRequest`

  returns: Result of the RegisterVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterVolumeResult`"
  (^com.amazonaws.services.opsworks.model.RegisterVolumeResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.RegisterVolumeRequest request]
    (-> this (.registerVolume request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSOpsWorks

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSOpsWorks this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn set-time-based-auto-scaling
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest`

  returns: Result of the SetTimeBasedAutoScaling operation returned by the service. - `com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult`"
  (^com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest request]
    (-> this (.setTimeBasedAutoScaling request))))

(defn update-app
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.UpdateAppRequest`

  returns: Result of the UpdateApp operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateAppResult`"
  (^com.amazonaws.services.opsworks.model.UpdateAppResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateAppRequest request]
    (-> this (.updateApp request))))

(defn describe-raid-arrays
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest`

  returns: Result of the DescribeRaidArrays operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeRaidArraysResult`"
  (^com.amazonaws.services.opsworks.model.DescribeRaidArraysResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest request]
    (-> this (.describeRaidArrays request))))

(defn unassign-instance
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.UnassignInstanceRequest`

  returns: Result of the UnassignInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.UnassignInstanceResult`"
  (^com.amazonaws.services.opsworks.model.UnassignInstanceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.UnassignInstanceRequest request]
    (-> this (.unassignInstance request))))

(defn tag-resource
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.opsworks.model.TagResourceResult`"
  (^com.amazonaws.services.opsworks.model.TagResourceResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn update-elastic-ip
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.UpdateElasticIpRequest`

  returns: Result of the UpdateElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateElasticIpResult`"
  (^com.amazonaws.services.opsworks.model.UpdateElasticIpResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateElasticIpRequest request]
    (-> this (.updateElasticIp request))))

(defn set-load-based-auto-scaling
  "Description copied from interface: AWSOpsWorks

  request - `com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest`

  returns: Result of the SetLoadBasedAutoScaling operation returned by the service. - `com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult`"
  (^com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult [^AbstractAWSOpsWorks this ^com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest request]
    (-> this (.setLoadBasedAutoScaling request))))

