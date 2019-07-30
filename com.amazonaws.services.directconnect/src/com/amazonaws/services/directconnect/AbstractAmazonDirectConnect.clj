(ns com.amazonaws.services.directconnect.AbstractAmazonDirectConnect
  "Abstract implementation of AmazonDirectConnect. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.directconnect AbstractAmazonDirectConnect]))

(defn describe-direct-connect-gateway-attachments
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest`

  returns: Result of the DescribeDirectConnectGatewayAttachments operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsResult`"
  (^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest request]
    (-> this (.describeDirectConnectGatewayAttachments request))))

(defn describe-direct-connect-gateways
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest`

  returns: Result of the DescribeDirectConnectGateways operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysResult`"
  (^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest request]
    (-> this (.describeDirectConnectGateways request))))

(defn allocate-hosted-connection
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest`

  returns: Result of the AllocateHostedConnection operation returned by the service. - `com.amazonaws.services.directconnect.model.AllocateHostedConnectionResult`"
  (^com.amazonaws.services.directconnect.model.AllocateHostedConnectionResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest request]
    (-> this (.allocateHostedConnection request))))

(defn delete-connection
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DeleteConnectionRequest`

  returns: Result of the DeleteConnection operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteConnectionResult`"
  (^com.amazonaws.services.directconnect.model.DeleteConnectionResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteConnectionRequest request]
    (-> this (.deleteConnection request))))

(defn create-public-virtual-interface
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest`

  returns: Result of the CreatePublicVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceResult`"
  (^com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest request]
    (-> this (.createPublicVirtualInterface request))))

(defn describe-tags
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeTagsResult`"
  (^com.amazonaws.services.directconnect.model.DescribeTagsResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeTagsRequest request]
    (-> this (.describeTags request))))

(defn set-region
  "Description copied from interface: AmazonDirectConnect

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonDirectConnect this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn associate-virtual-interface
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest`

  returns: Result of the AssociateVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceResult`"
  (^com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest request]
    (-> this (.associateVirtualInterface request))))

(defn accept-direct-connect-gateway-association-proposal
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalRequest`

  returns: Result of the AcceptDirectConnectGatewayAssociationProposal operation returned by the service. - `com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalResult`"
  (^com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalRequest request]
    (-> this (.acceptDirectConnectGatewayAssociationProposal request))))

(defn delete-direct-connect-gateway
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest`

  returns: Result of the DeleteDirectConnectGateway operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayResult`"
  (^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest request]
    (-> this (.deleteDirectConnectGateway request))))

(defn confirm-transit-virtual-interface
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceRequest`

  returns: Result of the ConfirmTransitVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceResult`"
  (^com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceRequest request]
    (-> this (.confirmTransitVirtualInterface request))))

(defn describe-interconnect-loa
  "Deprecated.

  request - `com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest`

  returns: Result of the DescribeInterconnectLoa operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeInterconnectLoaResult`"
  (^com.amazonaws.services.directconnect.model.DescribeInterconnectLoaResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest request]
    (-> this (.describeInterconnectLoa request))))

(defn describe-lags
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeLagsRequest`

  returns: Result of the DescribeLags operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeLagsResult`"
  (^com.amazonaws.services.directconnect.model.DescribeLagsResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeLagsRequest request]
    (-> this (.describeLags request))))

(defn describe-connections
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeConnectionsRequest`

  returns: Result of the DescribeConnections operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeConnectionsResult`"
  (^com.amazonaws.services.directconnect.model.DescribeConnectionsResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeConnectionsRequest request]
    (-> this (.describeConnections request)))
  (^com.amazonaws.services.directconnect.model.DescribeConnectionsResult [^AbstractAmazonDirectConnect this]
    (-> this (.describeConnections))))

(defn update-direct-connect-gateway-association
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationRequest`

  returns: Result of the UpdateDirectConnectGatewayAssociation operation returned by the service. - `com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationResult`"
  (^com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationRequest request]
    (-> this (.updateDirectConnectGatewayAssociation request))))

(defn untag-resource
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.directconnect.model.UntagResourceResult`"
  (^com.amazonaws.services.directconnect.model.UntagResourceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn delete-bgp-peer
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest`

  returns: Result of the DeleteBGPPeer operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteBGPPeerResult`"
  (^com.amazonaws.services.directconnect.model.DeleteBGPPeerResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest request]
    (-> this (.deleteBGPPeer request))))

(defn describe-virtual-interfaces
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest`

  returns: Result of the DescribeVirtualInterfaces operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult`"
  (^com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest request]
    (-> this (.describeVirtualInterfaces request)))
  (^com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult [^AbstractAmazonDirectConnect this]
    (-> this (.describeVirtualInterfaces))))

(defn allocate-public-virtual-interface
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest`

  returns: Result of the AllocatePublicVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceResult`"
  (^com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest request]
    (-> this (.allocatePublicVirtualInterface request))))

(defn delete-direct-connect-gateway-association
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest`

  returns: Result of the DeleteDirectConnectGatewayAssociation operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationResult`"
  (^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest request]
    (-> this (.deleteDirectConnectGatewayAssociation request))))

(defn confirm-connection
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.ConfirmConnectionRequest`

  returns: Result of the ConfirmConnection operation returned by the service. - `com.amazonaws.services.directconnect.model.ConfirmConnectionResult`"
  (^com.amazonaws.services.directconnect.model.ConfirmConnectionResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.ConfirmConnectionRequest request]
    (-> this (.confirmConnection request))))

(defn allocate-private-virtual-interface
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest`

  returns: Result of the AllocatePrivateVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceResult`"
  (^com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest request]
    (-> this (.allocatePrivateVirtualInterface request))))

(defn confirm-public-virtual-interface
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest`

  returns: Result of the ConfirmPublicVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceResult`"
  (^com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest request]
    (-> this (.confirmPublicVirtualInterface request))))

(defn shutdown
  "Description copied from interface: AmazonDirectConnect"
  ([^AbstractAmazonDirectConnect this]
    (-> this (.shutdown))))

(defn allocate-connection-on-interconnect
  "Deprecated.

  request - `com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest`

  returns: Result of the AllocateConnectionOnInterconnect operation returned by the service. - `com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectResult`"
  (^com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest request]
    (-> this (.allocateConnectionOnInterconnect request))))

(defn describe-loa
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeLoaRequest`

  returns: Result of the DescribeLoa operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeLoaResult`"
  (^com.amazonaws.services.directconnect.model.DescribeLoaResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeLoaRequest request]
    (-> this (.describeLoa request))))

(defn delete-lag
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DeleteLagRequest`

  returns: Result of the DeleteLag operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteLagResult`"
  (^com.amazonaws.services.directconnect.model.DeleteLagResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteLagRequest request]
    (-> this (.deleteLag request))))

(defn describe-hosted-connections
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest`

  returns: Result of the DescribeHostedConnections operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeHostedConnectionsResult`"
  (^com.amazonaws.services.directconnect.model.DescribeHostedConnectionsResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest request]
    (-> this (.describeHostedConnections request))))

(defn create-direct-connect-gateway-association-proposal
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalRequest`

  returns: Result of the CreateDirectConnectGatewayAssociationProposal operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalResult`"
  (^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalRequest request]
    (-> this (.createDirectConnectGatewayAssociationProposal request))))

(defn set-endpoint
  "Description copied from interface: AmazonDirectConnect

  endpoint - The endpoint (ex: \"directconnect.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://directconnect.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonDirectConnect this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-locations
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeLocationsRequest`

  returns: Result of the DescribeLocations operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeLocationsResult`"
  (^com.amazonaws.services.directconnect.model.DescribeLocationsResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeLocationsRequest request]
    (-> this (.describeLocations request)))
  (^com.amazonaws.services.directconnect.model.DescribeLocationsResult [^AbstractAmazonDirectConnect this]
    (-> this (.describeLocations))))

(defn describe-connection-loa
  "Deprecated.

  request - `com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest`

  returns: Result of the DescribeConnectionLoa operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeConnectionLoaResult`"
  (^com.amazonaws.services.directconnect.model.DescribeConnectionLoaResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest request]
    (-> this (.describeConnectionLoa request))))

(defn create-connection
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.CreateConnectionRequest`

  returns: Result of the CreateConnection operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateConnectionResult`"
  (^com.amazonaws.services.directconnect.model.CreateConnectionResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateConnectionRequest request]
    (-> this (.createConnection request))))

(defn delete-direct-connect-gateway-association-proposal
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalRequest`

  returns: Result of the DeleteDirectConnectGatewayAssociationProposal operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalResult`"
  (^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalRequest request]
    (-> this (.deleteDirectConnectGatewayAssociationProposal request))))

(defn create-direct-connect-gateway-association
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest`

  returns: Result of the CreateDirectConnectGatewayAssociation operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationResult`"
  (^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest request]
    (-> this (.createDirectConnectGatewayAssociation request))))

(defn update-lag
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.UpdateLagRequest`

  returns: Result of the UpdateLag operation returned by the service. - `com.amazonaws.services.directconnect.model.UpdateLagResult`"
  (^com.amazonaws.services.directconnect.model.UpdateLagResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.UpdateLagRequest request]
    (-> this (.updateLag request))))

(defn create-transit-virtual-interface
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceRequest`

  returns: Result of the CreateTransitVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceResult`"
  (^com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceRequest request]
    (-> this (.createTransitVirtualInterface request))))

(defn update-virtual-interface-attributes
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesRequest`

  returns: Result of the UpdateVirtualInterfaceAttributes operation returned by the service. - `com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesResult`"
  (^com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesRequest request]
    (-> this (.updateVirtualInterfaceAttributes request))))

(defn confirm-private-virtual-interface
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest`

  returns: Result of the ConfirmPrivateVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceResult`"
  (^com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest request]
    (-> this (.confirmPrivateVirtualInterface request))))

(defn create-private-virtual-interface
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest`

  returns: Result of the CreatePrivateVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceResult`"
  (^com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest request]
    (-> this (.createPrivateVirtualInterface request))))

(defn create-bgp-peer
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.CreateBGPPeerRequest`

  returns: Result of the CreateBGPPeer operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateBGPPeerResult`"
  (^com.amazonaws.services.directconnect.model.CreateBGPPeerResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateBGPPeerRequest request]
    (-> this (.createBGPPeer request))))

(defn disassociate-connection-from-lag
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest`

  returns: Result of the DisassociateConnectionFromLag operation returned by the service. - `com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagResult`"
  (^com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest request]
    (-> this (.disassociateConnectionFromLag request))))

(defn create-interconnect
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.CreateInterconnectRequest`

  returns: Result of the CreateInterconnect operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateInterconnectResult`"
  (^com.amazonaws.services.directconnect.model.CreateInterconnectResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateInterconnectRequest request]
    (-> this (.createInterconnect request))))

(defn describe-virtual-gateways
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest`

  returns: Result of the DescribeVirtualGateways operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult`"
  (^com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest request]
    (-> this (.describeVirtualGateways request)))
  (^com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult [^AbstractAmazonDirectConnect this]
    (-> this (.describeVirtualGateways))))

(defn delete-interconnect
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DeleteInterconnectRequest`

  returns: Result of the DeleteInterconnect operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteInterconnectResult`"
  (^com.amazonaws.services.directconnect.model.DeleteInterconnectResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteInterconnectRequest request]
    (-> this (.deleteInterconnect request))))

(defn describe-direct-connect-gateway-association-proposals
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsRequest`

  returns: Result of the DescribeDirectConnectGatewayAssociationProposals operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsResult`"
  (^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsRequest request]
    (-> this (.describeDirectConnectGatewayAssociationProposals request))))

(defn create-lag
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.CreateLagRequest`

  returns: Result of the CreateLag operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateLagResult`"
  (^com.amazonaws.services.directconnect.model.CreateLagResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateLagRequest request]
    (-> this (.createLag request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonDirectConnect

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonDirectConnect this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-virtual-interface
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest`

  returns: Result of the DeleteVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceResult`"
  (^com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest request]
    (-> this (.deleteVirtualInterface request))))

(defn describe-connections-on-interconnect
  "Deprecated.

  request - `com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest`

  returns: Result of the DescribeConnectionsOnInterconnect operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectResult`"
  (^com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest request]
    (-> this (.describeConnectionsOnInterconnect request))))

(defn associate-hosted-connection
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest`

  returns: Result of the AssociateHostedConnection operation returned by the service. - `com.amazonaws.services.directconnect.model.AssociateHostedConnectionResult`"
  (^com.amazonaws.services.directconnect.model.AssociateHostedConnectionResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest request]
    (-> this (.associateHostedConnection request))))

(defn create-direct-connect-gateway
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest`

  returns: Result of the CreateDirectConnectGateway operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayResult`"
  (^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest request]
    (-> this (.createDirectConnectGateway request))))

(defn tag-resource
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.directconnect.model.TagResourceResult`"
  (^com.amazonaws.services.directconnect.model.TagResourceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn associate-connection-with-lag
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest`

  returns: Result of the AssociateConnectionWithLag operation returned by the service. - `com.amazonaws.services.directconnect.model.AssociateConnectionWithLagResult`"
  (^com.amazonaws.services.directconnect.model.AssociateConnectionWithLagResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest request]
    (-> this (.associateConnectionWithLag request))))

(defn allocate-transit-virtual-interface
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceRequest`

  returns: Result of the AllocateTransitVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceResult`"
  (^com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceRequest request]
    (-> this (.allocateTransitVirtualInterface request))))

(defn describe-direct-connect-gateway-associations
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest`

  returns: Result of the DescribeDirectConnectGatewayAssociations operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsResult`"
  (^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest request]
    (-> this (.describeDirectConnectGatewayAssociations request))))

(defn describe-interconnects
  "Description copied from interface: AmazonDirectConnect

  request - `com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest`

  returns: Result of the DescribeInterconnects operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeInterconnectsResult`"
  (^com.amazonaws.services.directconnect.model.DescribeInterconnectsResult [^AbstractAmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest request]
    (-> this (.describeInterconnects request)))
  (^com.amazonaws.services.directconnect.model.DescribeInterconnectsResult [^AbstractAmazonDirectConnect this]
    (-> this (.describeInterconnects))))

